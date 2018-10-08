package com.BlackManta.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/config.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println("Employee ID= "+emp.getId());
        System.out.println("Employee Name ="+emp.getName());
    }
}
