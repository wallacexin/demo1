package cn.wallace.service;

import cn.wallace.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(int id);
    public List getAllUsers();
    boolean addUser(User user);
}
