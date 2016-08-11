package com.spring.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ttnd on 2/4/16.
 */
public class Apllication {

    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
     //   ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        ctx.registerShutdownHook();;
        Restaurant restaurant = ctx.getBean("expressrestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();
        //  Database d =ctx.getBean("mysql",Database.class);
        //  System.out.println("name --->" + d.getName() + " port-->" + d.getPort());
/*

Restaurant restaurant = ctx.getBean("tearestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();


              restaurant = ctx.getBean("expressrestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();


    /*    //inner bean
        restaurant = ctx.getBean("restaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();*/

        //alias
      /*  restaurant = ctx.getBean("testalias",Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();*/
       /* Complex complex = ctx.getBean("complexObject", Complex.class);
        System.out.println(complex);

        //autowiring

        Restaurant restaurant = ctx.getBean("expressrestaurant1", Restaurant.class);
        restaurant.hotDrink.prepareHotdrink();

        //scope
        System.out.println("type-->" + ctx.isPrototype("expressrestaurant2"));
        System.out.println("type-->" + ctx.isSingleton("expressrestaurant1"));

        Triangle triangle = ctx.getBean("triangle", Triangle.class);
        System.out.println(triangle);


        Restaurant res = ctx.getBean("expressrestaurant", Restaurant.class);

        System.out.println(res);*/
    }
}
