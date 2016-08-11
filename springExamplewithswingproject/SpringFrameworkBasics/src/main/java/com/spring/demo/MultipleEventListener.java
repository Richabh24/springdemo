package com.spring.demo;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

/**
 * Created by ttnd on 25/6/16.
 */
public class MultipleEventListener {
    @EventListener(ContextStartedEvent.class)
    void start() {
        System.out.println("----------------start");
    }
    @EventListener(ContextStoppedEvent.class)
    void stopped() {
        System.out.println("----------------stopped");
    }
}
