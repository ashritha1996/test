package com.spring.test.aspect.model;

import com.spring.test.aspect.Loggable;

public class Circle {

    private String name;

    @Loggable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //for testing after returning advise annotation
       // throw (new RuntimeException());
    }

    //testing return for after return call and fetch the data
    public String setNameReturn(String name) {
        this.name = name;
        //for testing after returning exception catch advise annotation
       //  throw (new RuntimeException());
       return name;
    }
}
