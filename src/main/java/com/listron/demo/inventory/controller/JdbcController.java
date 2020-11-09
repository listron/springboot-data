package com.listron.demo.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    /*@Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/userlist")
    public List<Map<String,Object>> userList(){
        String sql= "select *from user";
        List<Map<String,Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList;
    }*/
}
