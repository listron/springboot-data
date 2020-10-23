package com.listron.demo.dao;

import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

@Repository("RedisDao")
public class RedisDaoImpl implements RedisDao{

    @Resource
    private JedisCluster jedisCluster;
    @Override
    public void set(String key, String value) {
        jedisCluster.set(key,value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }
}
