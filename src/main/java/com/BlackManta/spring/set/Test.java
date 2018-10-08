package com.BlackManta.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/setConfig.xml");
        CarDealer dealer = (CarDealer)context.getBean("dealer");
        System.out.println("Dealership owner: "+dealer.getName());
        System.out.println("Models Available"+dealer.getModels());
        System.out.println("Class used"+dealer.getModels().getClass());
    }
}
