package top.seiei.gmerp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.seiei.gmerp.common.Const;
import top.seiei.gmerp.common.ServerResponse;
import top.seiei.gmerp.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/api/user/")
@CrossOrigin(origins = "http://127.0.0.1:8020", maxAge = 3600)
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登陆接口
     * @param params 账户名称及密码
     * @return 是否成功
     */
    @RequestMapping(value = "signin", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse signin(HttpSession session, @RequestBody Map<String, String> params) {
        String code = params.get("code");
        String pw = params.get("pw");
        ServerResponse serverResponse = userService.signin(code, pw);
        if (serverResponse.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, serverResponse.getData());
        }
        return serverResponse;
    }


    /**
     * GET 登陆接口
     * @param session session 对象
     * @param code 账户名称
     * @param pw 密码
     * @return 是否成功
     */
    @RequestMapping(value = "signinByGet", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse signinByGet(HttpSession session, String code, String pw) {
        ServerResponse serverResponse = userService.signin(code, pw);
        if (serverResponse.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, serverResponse.getData());
        }
        return serverResponse;
    }
}
