package com.spring.demo;

/**
 * Created by ttnd on 2/4/16.
 */
public class Point {
    Integer aAxis;
    Integer bAxis;

    public Integer getaAxis() {
        return aAxis;
    }

    public Integer getbAxis() {
        return bAxis;
    }

    public void setaAxis(Integer aAxis) {
        this.aAxis = aAxis;
    }

    public void setbAxis(Integer bAxis) {
        this.bAxis = bAxis;
    }

    @Override
    public String toString() {
        return "Point{" +
                "aAxis=" + aAxis +
                ", bAxis=" + bAxis +
                '}';
    }
}
