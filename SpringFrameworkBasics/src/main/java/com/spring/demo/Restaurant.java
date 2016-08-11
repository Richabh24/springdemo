package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ttnd on 2/4/16.
 */
public class Restaurant {
    HotDrink hotDrink;

    public Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;


    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
     @Autowired
    //@Required
    public void setHotDrink(HotDrink hotDrink) {

        this.hotDrink = hotDrink;
    }
}
