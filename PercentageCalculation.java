package com.company.HW;

//We have to calculate the percentage of marks obtained in three subjects
// (each out of 100) by student A and in four subjects (each out of 100) by student B.
// Create an abstract class 'Marks' with an abstract method 'getPercentage'.
// It is inherited by two other classes 'A' and 'B' each having a method
// with the same name which returns the percentage of the students.
// The constructor of student A takes the marks in three subjects as its parameters
// and the marks in four subjects as its parameters for student B.
// Create an object for each of the two classes and
// print the percentage of marks for both the students.

abstract class Marks{
    public int math;
    public int reading;
    public int social;
    public int science;

    public abstract void getPercentage();
}

class StudentA extends Marks{

    public StudentA(int math, int social, int reading){
        this.math = math;
        this.reading =reading;
        this.social = social;

    }

    @Override
    public void getPercentage() {

        System.out.println("Student A has: " + ((math+reading+social)*100)/(3*100) + "%");
    }
}

class StudentB extends Marks{

    public StudentB(int math, int social, int reading, int science){
        this.math = math;
        this.reading =reading;
        this.social = social;
        this.science = science;
    }

    @Override
    public void getPercentage() {
        System.out.println("Student A has: " + ((math+reading+social+science)*100)/(4*100) + "%");
    }
}
public class PercentageCalculation {
    public static void main(String[] args) {
//        StudentA A = new StudentA(65, 50, 75);
//        A.getPercentage();
//        StudentB B = new StudentB(65, 50, 75, 80);
//        B.getPercentage();
        StudentA A = new StudentA(65, 50, 75);
        A.getPercentage();
        StudentB B = new StudentB(65, 50, 75, 80);
        B.getPercentage();
    }
}
