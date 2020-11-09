package com.listron.demo.cache;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class JedisTest {

    public static void main(String[] args) throws Exception {
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        jedisClusterNodes.add(new HostAndPort("10.10.34.104", 7002));
        jedisClusterNodes.add(new HostAndPort("10.10.33.140", 7003));
        jedisClusterNodes.add(new HostAndPort("10.10.33.111", 7005));
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes);
        System.out.println(jedisCluster.get("product_info_1"));
        System.out.println(jedisCluster.get("shop_info_1"));
    }
}
