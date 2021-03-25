package com.spring.test.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

//draw event creation
public class drawEvent extends ApplicationEvent {

    public drawEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "Draw Event";
    }
}
