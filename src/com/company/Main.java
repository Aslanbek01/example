package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Асус\\IdeaProjects\\untitled6\\java.txt");
        Scanner sc = new Scanner(file);
        double x;
        double y;
        shape newshape = new shape();

        while (sc.hasNextInt()) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point cor1 = new Point(x, y);
            newshape.addPoint(cor1);
        }


        newshape.calculatedistance();
        System.out.println(newshape.calculateperimetr());
        System.out.println(newshape.averageLength());
        System.out.println(newshape.longestSide());

    }
}


