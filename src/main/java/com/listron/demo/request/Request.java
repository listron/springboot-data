package com.listron.demo.request;

/**
 * 请求接口
 * @author Administrator
 *
 */
public interface Request {
    void process();
    Integer getProductId();
    boolean isForceRefresh();
}
