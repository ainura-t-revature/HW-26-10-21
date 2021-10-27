package com.company.HW;

// Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively.
// 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
// each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.

abstract class Bank{
    public int deposit1 = 100;
    public int deposit2 = 200;
    public int deposit3 = 150;

//    public Bank(int dep1, int dep2, int dep3){
//        this.deposit1 = dep1;
//        this.deposit2 = dep2;
//        this.deposit3 = dep3;
//    }

    public abstract void getBalance();
}

class BankA extends Bank{


//    public BankA(int dep1, int dep2, int dep3){
//        this.deposit1 = dep1;
//        this.deposit2 = dep2;
//        this.deposit3 = dep3;
//    }

    @Override
    public void getBalance() {
        System.out.println("The balance of BankA: " + (deposit1 + deposit2 + deposit3) );
    }
}
class BankB extends Bank{
//    public BankB(int dep1, int dep2, int dep3){
//        this.deposit1 = dep1;
//        this.deposit2 = dep2;
//        this.deposit3 = dep3;
//    }
    @Override
    public void getBalance() {
        System.out.println("The balance of BankB: " + (deposit1 + deposit2 + deposit3) );
    }
}
class BankC extends Bank{
//    public BankC(int dep1, int dep2, int dep3){
//        this.deposit1 = dep1;
//        this.deposit2 = dep2;
//        this.deposit3 = dep3;
//    }
    @Override
    public void getBalance() {
        System.out.println("The balance of BankC: " + (deposit1 + deposit2 + deposit3) );

    }
}

public class Balance {
    public static void main(String[] args) {
//        BankA A = new BankA(100,200,300);
        //        BankB B = new BankB(1,2,3);
        //        BankC C = new BankC(10,20,30);
        BankA A = new BankA();
        A.getBalance();

        BankB B = new BankB();
        B.getBalance();

        BankC C = new BankC();
        C.getBalance();
    }
}
