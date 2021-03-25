package com.spring.test.spring;


import com.spring.test.TestApplication;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class factory {

    public static void main(String[] args) {

//        //using bean factory
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\Sherry\\Downloads\\test\\test\\src\\main\\java\\com\\spring\\test\\spring\\spring.xml"));
//        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
//        triangle.draw();
//        Circle circle = (Circle) beanFactory.getBean("circle");
//        circle.draw();

        //using application context for triangle
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
//        triangleContext.draw();
//        Circle circleContext = (Circle) applicationContext.getBean("circle");
//        circleContext.draw();

        //using point, collections, idref & inner bean class
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
//        triangleContext.draw();

        //using aliases
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        Triangle triangleContext = (Triangle) applicationContext.getBean("tri");
//        triangleContext.draw();

        //using bean def. inheritance class
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        Triangle triangleContext = (Triangle) applicationContext.getBean("triangle2");
//        triangleContext.draw();

        //closing app context & placeholder & Shape interface
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        applicationContext.registerShutdownHook();
////        Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
////        triangleContext.draw();
////
////        Circle circle = (Circle) applicationContext.getBean("circle");
////        circle.draw();
//        Shape shape = (Shape) applicationContext.getBean("circle");
//        shape.draw();

//        Shape shape2 = (Shape) applicationContext.getBean("triangle");
//        shape2.draw();

        //this is for msg propery file
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/test/spring/spring.xml");
//        Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
//        triangleContext.draw();
//
//        Circle circle = (Circle) applicationContext.getBean("circle");
//        circle.draw();
        Shape shape = (Shape) applicationContext.getBean("circle");
        shape.draw();
//        MessageSource resources = new ClassPathXmlApplicationContext("beans.xml");
//        String message = resources.getMessage("message", null, "Default", null);
//        System.out.println(message);
        System.out.println(applicationContext.getMessage("greeting", null, "Default", null));


    }
}
