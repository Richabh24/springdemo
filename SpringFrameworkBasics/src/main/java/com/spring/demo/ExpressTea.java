package com.spring.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ttnd on 2/4/16.
 */
public class ExpressTea implements HotDrink ,InitializingBean,DisposableBean{
    @Override
    public void prepareHotdrink() {

        System.out.println("PRPARE ExpressTea HOTDRINK");
    }

    public void initbean(){
        System.out.println("Bean is going through init.");
    }
    public void destroybean(){
        System.out.println("Bean will destroy now.");
    }
    @PostConstruct
    public void initbean1(){
        System.out.println("Bean is going through init.-JAVA");
    }
    @PreDestroy
    public void destroybean2(){
        System.out.println("Bean will destroy now.-JAVA");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean will destroy now. -interface.");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean will destroy now.-inerface");

    }
}
