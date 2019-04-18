package top.seiei.gmerp.service;

import org.springframework.stereotype.Service;
import top.seiei.gmerp.common.ServerResponse;
import top.seiei.gmerp.dao.UserMapper;
import top.seiei.gmerp.vo.UserVO;

import javax.annotation.Resource;

@Service("userService")
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 登陆接口
     * @param code 用户账号
     * @param pw 密码
     * @return 是否成功
     */
    public ServerResponse signin(String code, String pw) {
        int count = userMapper.checkByCode(code);
        if (count == 0) {
            return ServerResponse.createdByError("该用户不存在");
        }
        UserVO userVO = userMapper.selectByCodeAndPW(code, pw);
        if (userVO == null) {
            return ServerResponse.createdByError("密码错误");
        }
        userVO.setPw(null);
        return ServerResponse.createdBySuccess("登陆成功", userVO);
    }
}
