package com.company.HW;

import java.util.Scanner;

//Take name, roll number and field of interest from user and print in the format below :
//        Hey, my name is xyz and my roll number is xyz. My field of interest are xyz

//class PersonInfo{
//    public String name;
//    public int rollNum;
//    public String fieldOfInterest;
//
//    public PersonInfo(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        this.name = sc.nextLine();
//        System.out.println("Enter your roll number: ");
//        this.rollNum = sc.nextInt();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your field: ");
//        this.fieldOfInterest = s.nextLine();
//    }
//
//    public void display(){
//        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNum + ". My field of interest is " + fieldOfInterest + ".");
//    }
//}


public class Person {
    public static void main(String[] args) {
//
//        PersonInfo personInfo = new PersonInfo();
//        personInfo.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your field: ");
        String fieldOfInterest = sc.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNum + ". My field of interest is " + fieldOfInterest + ".");



    }
}
