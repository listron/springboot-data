package com.listron.demo.controller;

import com.listron.demo.mapper.UserMapper;
import com.listron.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> list = userMapper.queryUserl();
        for (User user:list){
            System.out.print(user);
        }
        return list;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(7,"张三三","345678"));
        return "ok";
    }
    @GetMapping("/queryUserById")
    public User queryUserById(){
        User user = userMapper.queryUserById(7);
        System.out.print(user);
        return user;
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(7);
        return "OK";
    }
}
