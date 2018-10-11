package com.BlackManta.spring.lifeCycles.XML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/xmlConfig.xml");
        Patient patient = (Patient)context.getBean("patient");
        //How to call the on Destroy method
        context.registerShutdownHook();
        System.out.println(patient);
    }

}
