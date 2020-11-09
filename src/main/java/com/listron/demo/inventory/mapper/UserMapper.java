package com.listron.demo.inventory.mapper;

import com.listron.demo.inventory.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


//这个注解表示一个mybatis的mapper类，Dao
//@Mapper
//@Repository
public interface UserMapper {
    List<User> queryUserl();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    //亿级流量项目用的接口
    User findUserInfo();
}
