package com.guigu.bean;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class IOCTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/ioc.xml");
    ConfigurableApplicationContext ioc0 = new ClassPathXmlApplicationContext("conf/ioc.xml");

    @Test
    public void tesr01(){
        Object bean = ioc.getBean("book01");
        System.out.println("ioc close");
        ioc0.close();
    }


}