package com.spring.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by ttnd on 25/6/16.
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("_>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(customEvent.getSource());
    }
}
