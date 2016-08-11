package com.spring.demo;

import java.util.*;

/**
 * Created by ttnd on 2/4/16.
 */
public class Complex {
    List list;
    Map map;
    Set set;

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public Map getMap() {
        return map;
    }

    public Set getSet() {
        return set;
    }


    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }
}
