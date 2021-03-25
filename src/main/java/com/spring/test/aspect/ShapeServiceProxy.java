package com.spring.test.aspect;

import com.spring.test.aspect.model.Circle;

//proxy class
public class ShapeServiceProxy extends ShapeService{
    @Override
    public Circle getCircle() {
        return super.getCircle();
    }
}
