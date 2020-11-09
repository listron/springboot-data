package com.listron.demo.inventory.controller;

import com.listron.demo.inventory.mapper.UserMapper;
import com.listron.demo.inventory.pojo.User;
import com.listron.demo.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class UserController {
    //@Autowired
    private UserMapper userMapper;

    //@Autowired
    private UserService userService;

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
        //userMapper.addUser(new User(7,"张三三","345678"));
        userMapper.addUser(new User(7,"张三三","345678",25));
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

    //亿级流量mysql查询接口
    @GetMapping("/getUserInfo")
    public User getUserInfo() {
        User user = userService.findUserInfo();
        return user;
    }

    @GetMapping("/getCachedUserInfo")
    public User getCachedUserInfo() {
        return userService.getCachedUserInfo();
    }
}
