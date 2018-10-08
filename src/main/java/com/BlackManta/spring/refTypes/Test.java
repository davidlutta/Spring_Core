package com.BlackManta.spring.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/refConfig.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
}
