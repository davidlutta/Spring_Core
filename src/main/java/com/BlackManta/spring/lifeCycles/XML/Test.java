package com.BlackManta.spring.lifeCycles.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/xmlConfif.xml");
        Patient patient = (Patient)context.getBean("patient");
        System.out.println(patient);
    }

}
