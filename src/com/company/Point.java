package com.company;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()- point.getY(),2));
    }
}