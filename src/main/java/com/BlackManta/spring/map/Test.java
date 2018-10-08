package com.BlackManta.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/mapConfig.xml");
        Customer customer = (Customer)context.getBean("customer");
        System.out.println(customer.toString());
    }
}
