package com.spring.demo;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

/**
 * Created by ttnd on 25/6/16.
 */
public class Dummytest {

    @Value("#{'SpEL'}")
    String name;

    @Value("#{23}")
    Integer age;

    @Value("#{{1,2,3,4}}")
    List list;

    @Value("#{{a:1,b:2,c:3}}")
    Map map;

    @Value("#{systemProperties['user.country']}")
    String country;


    @Value("${valueFromFile}")
    String state;

   /* String name;

    Integer age;

    List list;

    Map map;

    String country;

    String state;

    public String getName() {
        return name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Dummytest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", map=" + map +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
