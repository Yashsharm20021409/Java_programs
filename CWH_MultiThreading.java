// by extend thread class

package com.company;

class MyThred extends Thread{
    @Override
    public void run(){
//        while (true) {
//            System.out.println("My thread1 is running");
//            System.out.println("I am Happy");
//        }
        int i = 0;
        while (i<5) {
            System.out.println("My thread1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThred2 extends Thread{
    @Override
    public void run(){
//        while(true) {
//            System.out.println("Thread2 is good");
//            System.out.println("I am sad");
//        }
        int i = 0;
        while(i<5) {
            System.out.println("Thread2 is good");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class CWH_MultiThreading {
    public static void main(String[] args) {
        MyThred ob = new MyThred();
        MyThred2 ob1 = new MyThred2();

        // internally start method invoke run method by default
        // after this some time mythred run function will run sometime mythred2 run function
        // this is working of multithreading by extend thread class
        ob.start();
        ob1.start();
    }
}
