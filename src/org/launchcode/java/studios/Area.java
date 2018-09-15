package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        Scanner userInput;

        double radius;

        double area;

        double pi = 3.14;

        userInput = new Scanner(System.in);

        System.out.println("Enter the radius");
        radius = userInput.nextDouble();

        if (radius <= 0){
            System.out.println("The radius entered is invalid, please enter a radius > 0");
            do {

                System.out.println("Enter the radius");
                radius = userInput.nextDouble();

            } while (radius <= 0);
        }

        area = pi * (radius * radius);

        System.out.println("The area of the circle with radius " + radius+ " is " +area);

    }
}
