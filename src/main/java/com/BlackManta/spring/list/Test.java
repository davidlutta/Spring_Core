package com.BlackManta.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/listConfig.xml");
        Hospital hospital = (Hospital) context.getBean("hospital");
        System.out.println("Hostpital name is : "+hospital.getName());
        System.out.print("Departments are: "+hospital.getDepartments().getClass());
    }
}
