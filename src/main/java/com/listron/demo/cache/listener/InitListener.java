package com.listron.demo.cache.listener;

import com.listron.demo.cache.kafka.KafkaConsumer;
import com.listron.demo.cache.spring.SpringContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 系统初始化的监听器
 * @author Administrator
 *
 */
public class InitListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        //ServletContext sc = sce.getServletContext();
        //ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(sc);
        //SpringContext.setApplicationContext(context);

        //topic  cache-message
        System.out.print("KafkaConsumer "+ "\n");
        new Thread(new KafkaConsumer("cache-message")).start();
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
