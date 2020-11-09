package com.listron.demo.inventory.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

//@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }


    //后台监控功能  独特之处
    //因为springboot内置了 servlet容器，所以没有web.xml，替代方法 ServletRegistrationBean
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");

        //后台需要人登陆账号，密码
        HashMap<String,String> stringHashMap = new HashMap<>();
        //固定的，loginUsername，loginPassword
        stringHashMap.put("loginUsername","admin");
        stringHashMap.put("loginPassword","123456");

        //允许谁访问
        //stringHashMap.put("allow","");

        //禁止谁访问

        //bean.setInitParameters(stringHashMap);
        return bean;
    }

//    @Bean
//    public FilterRegistrationBean webStatFilter(){
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//
//        //可以过滤那些请求呢
//        Map<String,String> stringStringMap = new HashMap<>();
//
//        //这些东西不进行统计
//        stringStringMap.put("exclusions","*.js,*.css,/druid/*");
//
//        bean.setInitParameters(stringStringMap);
//
//        return bean;
//    }

}
