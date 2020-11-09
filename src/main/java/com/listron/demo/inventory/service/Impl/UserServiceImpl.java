package com.listron.demo.inventory.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.listron.demo.inventory.dao.RedisDao;
import com.listron.demo.inventory.mapper.UserMapper;
import com.listron.demo.inventory.pojo.User;
import com.listron.demo.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {


    //@Resource
    private UserMapper userMapper;
    @Resource
    private RedisDao redisDao;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public User getCachedUserInfo() {
        redisDao.set("cached_user", "{\"name\": \"zhangsan\", \"age\": 25}") ;
        String json = redisDao.get("cached_user");
        JSONObject jsonObject = JSONObject.parseObject(json);

        User user = new User();
        user.setName(jsonObject.getString("name"));
        user.setAge(jsonObject.getInteger("age"));

        return user;
    }
}
