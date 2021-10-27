package com.company.HW;

import java.util.Scanner;
// Ask user to give two double input
// for length and breadth of a rectangle
// and print area type casted to int.
// A = 1/2 * b * h

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the Triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the Triangle: ");
        double height = sc.nextDouble();


        int area =  (int)(0.5 * base * height);
        System.out.println("The Area of Triangle is: " + area);

    }
}
