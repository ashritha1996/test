package com.spring.test.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;
//implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean
public class Triangle implements Shape{
//    This is for xml dependency injection
//    private String type;
//    private int height;
//
//    //single arg constructor - one arg value is req in xml
//    public Triangle(String type) {
//        this.type = type;
//    }
//
//    //what if two single arg constructors are present ? to diff, add type in constructor arg in xml
//    public Triangle(int height) {
//        this.height = height;
//    }
//    //multiple arg constructor - 2 arg values is req in xml
//    public Triangle(String type, int height) {
//        this.type = type;
//        this.height = height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void draw(){
//        System.out.println("Height:"  + getHeight() + " Type: " +  getType() + " triangle drawing");
//    }

    //this is for point class
//    private Point pointA;
//    private Point pointB;
//    private Point pointC;
//
//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }
//
//    public void draw(){
//        System.out.println("" + getPointA().getX() + getPointB().getX() + getPointC().getX());
//        System.out.println("" + getPointA().getY() + getPointB().getY() + getPointC().getY());
//
//    }
    //This is for collections-list
//    private List<Point> pointList;
//
//    public List<Point> getPointList() {
//        return pointList;
//    }
//
//    public void setPointList(List<Point> pointList) {
//        this.pointList = pointList;
//    }
//
//    public void draw(){
//        for(Point point: pointList) {
//            System.out.println("" + point.getX() + " " + point.getY());
//        }
//
//    }

    //this is for auto wiring point class
    private Point pointA;
    private Point pointB;
    private Point pointC;
    //this is for setting application context instead of using autowiring
    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    //shape interface
    @Override
    public void draw(){
        System.out.println("Drawing Triangle ...");
        System.out.println("" + getPointA().getX() + getPointB().getX() + getPointC().getX());
        System.out.println("" + getPointA().getY() + getPointB().getY() + getPointC().getY());

    }

    //this is for application context class

//    @Override
//    public void setBeanName(String beanName) {
//        System.out.println("Bean Name: "  + beanName);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.context = applicationContext;
//    }

    //this is for setting a method while initializing bean
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing bean ... ");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Destructing bean ... ");
//    }
//
    //manual methods for init and destroy
    public void init() {
        System.out.println("Initializing bean ... ");
    }
    public void destroy() throws Exception {
        System.out.println("Destructing bean ... ");
    }
}
