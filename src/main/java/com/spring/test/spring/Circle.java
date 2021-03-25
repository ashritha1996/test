package com.spring.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
//to tell the class is bean using annotations
@Component
//@Service - business level
//@Controller - Spring MVC - req n resp
//@Repository - Data object
//ApplicationEventPublisherAware - provides publisher object to the bean
public class Circle implements Shape, ApplicationEventPublisherAware{

    private Point Centre;
//publishing event here
    private ApplicationEventPublisher publisher;


    public Point getCentre() {
        return Centre;
    }

//    @Required
//    @Autowired
//    @Qualifier("circleRelated")
    //doing injection by name
    @Resource(name = "pointC")
    public void setCentre(Point centre) {
        this.Centre = centre;
    }
    //this is for writing manual config during bean lifecycle - annotations can be used instead of explicitly mentioning
    //method in bean xml division
    @PostConstruct
    public void init(){
        System.out.println("Initializing circle...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying circle...");
    }

    @Override
    public void draw(){
        System.out.println("drawing circle" + Centre.getX() + " "  + Centre.getY());
        drawEvent drawEvent = new drawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    //for binding publisher method
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
