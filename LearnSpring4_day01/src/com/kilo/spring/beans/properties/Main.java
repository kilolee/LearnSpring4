package com.kilo.spring.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by kilo on 2019/4/11.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-properties.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
