package com.listron.demo.inventory.service;

import com.listron.demo.inventory.pojo.User;

//用户接口service
public interface UserService {

    //查询用户信息
    User findUserInfo();

    //获取redis集群的数据
    public User getCachedUserInfo();
}
