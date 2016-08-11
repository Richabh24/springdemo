package com.spring.demo;

/**
 * Created by ttnd on 2/4/16.
 */
public class Triangle {
    Point aPoint;
    Point bPoint;
    Point cPoint;


    public Point getaPoint() {
        return aPoint;
    }

    public Point getbPoint() {
        return bPoint;
    }

    public Point getcPoint() {
        return cPoint;
    }

    public void setaPoint(Point aPoint) {
        this.aPoint = aPoint;
    }

    public void setbPoint(Point bPoint) {
        this.bPoint = bPoint;
    }

    public void setcPoint(Point cPoint) {
        this.cPoint = cPoint;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aPoint=" + aPoint +
                ", bPoint=" + bPoint +
                ", cPoint=" + cPoint +
                '}';
    }
}
