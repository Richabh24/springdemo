package com.spring.demo;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ttnd on 25/6/16.
 */
public class CustomEvent  extends ApplicationEvent{
    CustomEvent(Object object) {
        super(object);

    }

    public void fire(){

        System.out.print("fire event");
    }
}
