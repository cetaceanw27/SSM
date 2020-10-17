package com.guigu.bean;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

class IOCTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/ioc.xml");
    ConfigurableApplicationContext ioc2 = new ClassPathXmlApplicationContext("conf/ioc2.xml");
    ConfigurableApplicationContext ioc3 = new ClassPathXmlApplicationContext("conf/ioc3.xml");


    @Test
    public void test03(){
        Person person = (Person) ioc3.getBean("person01");
        System.out.println(person);
    }

    @Test
    public void tesr02() throws SQLException {
        DataSource bean = ioc2.getBean(DataSource.class);
        System.out.println(bean.getConnection());

        Car bean2 = ioc2.getBean(Car.class);
        System.out.println(bean2);
    }

//    @Test
//    public void tesr01(){
//        Object bean = ioc.getBean("book01");
//        System.out.println("ioc close");
//        ioc.close();
//    }


}