package com.spring.demo;

/**
 * Created by ttnd on 25/6/16.
 */
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class MyEventListener implements ApplicationListener<ContextStartedEvent> {


    //Used when only Application Listner
    /*@Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
    }*/

    //Used when used ContextStartedEvent
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println(contextStartedEvent);

    }
}




