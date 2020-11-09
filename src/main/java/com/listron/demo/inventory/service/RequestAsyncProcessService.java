package com.listron.demo.inventory.service;

import com.listron.demo.inventory.request.Request;

public interface RequestAsyncProcessService {
    void process(Request request);
}
