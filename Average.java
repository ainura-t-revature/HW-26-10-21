package com.company.HW;

//Print the average of three numbers entered by user
// by creating a class named 'Average' having a method to calculate and print the average

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();


        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        nums.add(num1);
        nums.add(num2);
        nums.add(num3);

        int average = (num1 + num2 + num3)/nums.size();
        System.out.println("The Average of three numbers is: " + average);


    }
}
