package com.BlackManta.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("file:src/main/resources/propertiesConfig.xml");
        Languages languages = (Languages)context.getBean("languages");
        System.out.println(languages.toString());
    }
}
