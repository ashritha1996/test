package com.spring.test.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {


    public static void main(String[] args) {

        //auto config
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/aspect/aopspring.xml");

        //auto cast by using .class else add manual cast
        //ShapeService shapeService =  applicationContext.getBean("shapeService", ShapeService.class);
        //     System.out.println(shapeService.getCircle().getName());
//        shapeService.getCircle().setNameReturn("hello");
//        System.out.println(shapeService.getCircle().getName());
        //proxy class - factory service
        factoryService factoryService = new factoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        System.out.println(shapeService.getCircle());

       // System.out.println(shapeService.getTriangle().getName());

    }
}
