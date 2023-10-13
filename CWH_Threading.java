package com.company;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i<6)
        {
            System.out.println("My MyThread1 class thread is running successfully...");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i<6) {
            System.out.println("My MyThread2 class thread is running successfully...");
            System.out.println("I am feel better now");
            i++;
        }
    }
}

public class CWH_Threading {
    public static void main(String[] args) {
        MyThread1 ob1 = new MyThread1();
        MyThread2 ob2 = new MyThread2();

        ob1.start(); // use to run any thread class function/method
        ob2.start();
    }
}
