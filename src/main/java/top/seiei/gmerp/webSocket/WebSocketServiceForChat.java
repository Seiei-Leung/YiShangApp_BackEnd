package top.seiei.gmerp.webSocket;

import com.alibaba.fastjson.JSON;
import org.springframework.web.socket.server.standard.SpringConfigurator;
import top.seiei.gmerp.bo.MessageObj;
import top.seiei.gmerp.common.ChatCache;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@ServerEndpoint(value="/websocket/commodity/{fromUserId}", configurator = SpringConfigurator.class)
public class WebSocketServiceForChat {

    // 已经建立链接的对象缓存起来（线性安全）
    private static ConcurrentMap<Integer, WebSocketServiceForChat> serverMap = new ConcurrentHashMap<Integer, WebSocketServiceForChat>();

    // 记录当前 WebSocket 的 session 对象
    // 当中 isOpen 方法可以判断该用户是否在线
    // 调用 getBasicRemote().sendText(content) 可以发送消息到客户端
    private Session currentSession;

    /**
     * 用户开始连接 webSocket 事件
     * @PathParam 解释：https://blog.csdn.net/u011410529/article/details/66974974
     * @param session webSocket session 对象
     * @param fromUserId url 传入的用户 ID
     * @throws IOException
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("fromUserId") int fromUserId) throws IOException {
        this.currentSession = session;
        serverMap.put(fromUserId, this);//建立链接时，缓存对象，这个 this 就是 WebSocketServer 对象
        System.out.println("UserId:" + fromUserId + " 连接服务器成功。。。");
        System.out.println("session.getRequestURI:" + session.getRequestURI());
        System.out.println("session.getQueryString:" + session.getQueryString());
        System.out.println("session.getRequestParameterMap:" + session.getRequestParameterMap());
        // 用户刚刚登陆，接受不在线时的由后端缓存下来的消息
        List<MessageObj> messageObjList = ChatCache.getKey(ChatCache.CHATCACHE_PREFIX + fromUserId);
        if (messageObjList != null && messageObjList.size() > 0) {
            for (MessageObj item : messageObjList) {
                this.currentSession.getBasicRemote().sendText(JSON.toJSONString(item));
            }
            MessageObj useLessMessageObj = new MessageObj();
            useLessMessageObj.setContent("null");
            useLessMessageObj.setFromUserId(0);
            List<MessageObj> useLessMessageObjList = new ArrayList<>();
            messageObjList.add(useLessMessageObj);
            ChatCache.setKey(ChatCache.CHATCACHE_PREFIX + fromUserId, useLessMessageObjList);
        }
    }

    /**
     * 用户关闭 webSocket 连接事件，清除缓存
     * @param session webSocket session 对象
     * @param reason 连接关闭原因
     */
    @OnClose
    public void onClose(Session session, CloseReason reason) {
        System.out.println("用户关闭：" + reason.toString());
        // 如果缓存中有当前用户的缓存（这里的 this 就是 WebSocketServer 对象）
        if (serverMap.containsValue(this)) {
            Iterator<Integer> keys = serverMap.keySet().iterator();
            int userId = 0;
            while(keys.hasNext()) {
                userId = keys.next();
                if (serverMap.get(userId) == this) {
                    System.out.println("UserId: " + userId + "离开连接。。");
                    serverMap.remove(userId, this);//关闭链接时，删除缓存对象
                }
            }
        }
        this.currentSession = null;
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接过后，发送信息
     * @param json 信息 JSON 对象，当中包含发送者ID，接受者ID 以及发送信息
     */
    @OnMessage
    @SuppressWarnings("unchecked")
    public void onMessage(String json) {
        System.out.println("------------------ 聊天分割线 ---------------------");
        HashMap<String, String> map =  JSON.parseObject(json, HashMap.class);
        System.out.println("fromUserId: " + map.get("fromUserId"));
        System.out.println("toUserId: " + map.get("toUserId"));
        System.out.println("content: " + map.get("content"));
        int fromUserId = Integer.parseInt(map.get("fromUserId"));
        int toUserId = Integer.parseInt(map.get("toUserId"));
        String content = map.get("content").toString();
        WebSocketServiceForChat server = serverMap.get(toUserId);
        //若存在则用户在线，否在用户不在线
        if (server != null && server.currentSession.isOpen()) {
            if (fromUserId != toUserId) {
                try {
                    // 发送信息
                    MessageObj messageObj = new MessageObj();
                    messageObj.setContent(content);
                    messageObj.setFromUserId(fromUserId);
                    messageObj.setSendTime(new Date());
                    server.currentSession.getBasicRemote().sendText(JSON.toJSONString(messageObj));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // 对方不在线，缓存发送信息
            List<MessageObj> messageObjList = ChatCache.getKey(ChatCache.CHATCACHE_PREFIX + toUserId);
            MessageObj messageObj = new MessageObj();
            messageObj.setContent(content);
            messageObj.setFromUserId(fromUserId);
            messageObj.setSendTime(new Date());
            if (messageObjList == null) {
                messageObjList = new ArrayList<>();
                messageObjList.add(messageObj);
                ChatCache.setKey(ChatCache.CHATCACHE_PREFIX + toUserId, messageObjList);
            } else {
                messageObjList.add(messageObj);
                ChatCache.setKey(ChatCache.CHATCACHE_PREFIX + toUserId, messageObjList);
            }

        }
    }

    /**
     * 连接发生错误事件
     * @param t 错误对象
     */
    @OnError
    public void onError(Throwable t) {
        System.out.println("发生错误事件！！");
        t.printStackTrace();
    }
}