package cn.wallace.mapper;

import cn.wallace.entity.User;

import java.util.List;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectAllUsers();
}