package com.spring.test.aspect;

import com.spring.test.aspect.model.Circle;
import com.spring.test.aspect.model.Triangle;

//proxy class
public class factoryService {

    public Object getBean(String beanType){
        if(beanType.equals("shapeService")) return new ShapeServiceProxy();
        if(beanType.equals("triangle")) return new Triangle();
        if(beanType.equals("circle")) return new Circle();
        return null;
    }
}
