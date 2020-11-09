package com.listron.demo.inventory.dao;

public interface RedisDao {

    public void set(String key, String value);
    public String get(String key);
    void delete(String key);
}
