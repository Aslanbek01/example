package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class shape {
    private ArrayList<Double> doubleArrayList;
    private ArrayList<Point> pointArrayList;
    public shape(){
        pointArrayList = new ArrayList<>();
        doubleArrayList = new ArrayList<>();
    }

    public void addPoint(Point point){
        pointArrayList.add(point);
    }

    public void calculatedistance(){
         double distance=0;
        for (int i=0; i<pointArrayList.size()-1; i++){
            doubleArrayList.add(pointArrayList.get(i).distance(pointArrayList.get(i + 1)));
        }
        doubleArrayList.add(pointArrayList.get(0).distance(pointArrayList.get(pointArrayList.size() - 1)));
    }
    // Array = [1, 2, 3, 4, 5, 6]
    public double calculateperimetr(){
        double total = 0;
        for(int i=0;i<doubleArrayList.size(); i++){
            total+=doubleArrayList.get(i);
        }
        return total;
    }
    public double averageLength(){
        return calculateperimetr() / pointArrayList.size();
    }


   public double longestSide() {
        double max = 0;
        if(doubleArrayList.size() == 0) {
            calculatedistance();
        }
        for(int i = 0;i< doubleArrayList.size() - 1; i++) {
            if (doubleArrayList.get(i) > max) {
                max = doubleArrayList.get(i);
            }
        }
        return max;
    }
    }






