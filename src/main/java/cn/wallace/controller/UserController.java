package cn.wallace.controller;

import cn.wallace.entity.User;
import cn.wallace.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public List<User> toIndex(){
        List<User> users = this.userService.getAllUsers();
        return users;
    }

    @RequestMapping("/addUser")
    public User addUser() {
        User user = new User();
        user.setAge(10);
        user.setName("wallace");
        this.userService.addUser(user);
        return user;
    }
}

