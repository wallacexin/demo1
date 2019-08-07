package cn.wallace.service.serviceImpl;

import cn.wallace.entity.User;
import cn.wallace.mapper.UserMapper;
import cn.wallace.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List getAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        boolean result = false;
        try {
            userMapper.insertSelective(user);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
