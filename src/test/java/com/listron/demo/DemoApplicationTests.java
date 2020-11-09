package com.listron.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    /*@Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        //检测datasource
        System.out.print(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.print(connection);

        //XXXX Template Springboot已经配置好的模板bean 拿来即用

        //关闭
        connection.close();
    }*/

}
