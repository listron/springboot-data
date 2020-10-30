package com.listron.demo.listener;

import com.listron.demo.thread.RequestProcessorThreadPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 系统初始化监听器
 * @author Administrator
 *
 */
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.print("----------初始化开始------------");
         // 初始化工作线程池和内存队列
        RequestProcessorThreadPool.init();

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
