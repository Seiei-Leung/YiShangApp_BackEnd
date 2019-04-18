package top.seiei.gmerp.dao;

import org.apache.ibatis.annotations.Param;
import top.seiei.gmerp.bean.User;
import top.seiei.gmerp.bean.UserWithBLOBs;
import top.seiei.gmerp.vo.UserVO;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);

    UserVO selectById(String id);

    int checkByCode(String code);

    UserVO selectByCodeAndPW(@Param("code") String code, @Param("pw") String pw);
}