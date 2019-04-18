package top.seiei.gmerp.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import top.seiei.gmerp.bo.MessageObj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ChatCache {

    private static Log logger = LogFactory.getLog(ChatCache.class);

    public static final String CHATCACHE_PREFIX = "CHATCACHEUSERID_";

    // 本地服务器静态内存块
    // CacheBuilder 是一个链式的调用
    // initialCapacity(1000) 表示设置缓存的初始化容量是 1000
    // maximumSize(10000) 表示最大缓存容量，超过后悔移除缓存项（LRU 算法）
    // expireAfterAccess(12, TimeUnit.HOURS) 表示设置有效时长，现在表示12个小时
    // build 方法有两个，带 CacheLoader 抽象类作为参数的这个，就是表示当获取缓存中的key其数值为null时，返回的默认数值
    private static LoadingCache<String, List<MessageObj>> loadingCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000).expireAfterAccess(12,TimeUnit.HOURS).build(new CacheLoader<String, List<MessageObj>>() {
        @Override
        // 默认的数据加载实现，当调用get取值时，若key没有对应的数值，则调用这个方法进行加载，必须返回一个实例字符串不能直接返回null，否则会报异常
        public List<MessageObj> load(String s) throws Exception {
            MessageObj useLessMessageObj = new MessageObj();
            useLessMessageObj.setContent("null");
            useLessMessageObj.setFromUserId(0);
            List<MessageObj> messageObjList = new ArrayList<>();
            messageObjList.add(useLessMessageObj);
            return messageObjList;
        }
    });

    // 存放缓存
    public static void setKey(String key, List<MessageObj> value) {
        loadingCache.put(key, value);
    }

    // 获取缓存对应的数值
    public static List<MessageObj> getKey(String key) {
        List<MessageObj> value = null;
        try {
            value = loadingCache.get(key);
            if (value.size() == 1 && StringUtils.equals(value.get(0).getContent(), "null") && value.get(0).getFromUserId() == 0) {
                return null;
            }
            return value;
        } catch (ExecutionException e) {
            logger.error("服务器本地缓存出错", e);
        }
        return null;
    }
}
