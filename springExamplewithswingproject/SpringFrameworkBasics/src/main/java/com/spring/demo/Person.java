package com.spring.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by ttnd on 25/6/16.
 */
public class Person {
    String name;
    Integer age;
    String city;

    public Person(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static Person getEmployeeViaStaticMethod(){

Person p =new Person("name",25,"testcity");
        System.out.println("getEmployeeViaStaticMethod------>");

        return   p;

    }
}
