package com.spring.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ttnd on 25/6/16.
 */
public class PersonalisedService {
    Integer age;
    Integer incrementedAge;
    Boolean isAgeGreaterThan10;
    Integer firstElementOfList;
    Integer mapValue;
    Person employee;

    @Override
    public String toString() {
        return "PersonalisedService{" +
                "age=" + age +
                ", incrementedAge=" + incrementedAge +
                ", isAgeGreaterThan10=" + isAgeGreaterThan10 +
                ", firstElementOfList=" + firstElementOfList +
                ", mapValue=" + mapValue +
                ", employee=" + employee +
                '}';
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIncrementedAge() {
        return incrementedAge;
    }

    public void setIncrementedAge(Integer incrementedAge) {
        this.incrementedAge = incrementedAge;
    }

    public Boolean getIsAgeGreaterThan10() {
        return isAgeGreaterThan10;
    }

    public void setIsAgeGreaterThan10(Boolean isAgeGreaterThan10) {
        this.isAgeGreaterThan10 = isAgeGreaterThan10;
    }

    public Integer getFirstElementOfList() {
        return firstElementOfList;
    }

    public void setFirstElementOfList(Integer firstElementOfList) {
        this.firstElementOfList = firstElementOfList;
    }

    public Integer getMapValue() {
        return mapValue;
    }

    public void setMapValue(Integer mapValue) {
        this.mapValue = mapValue;
    }

}
