package com.listron.demo.dao;

public interface RedisDao {

    public void set(String key, String value);
    public String get(String key);
}
