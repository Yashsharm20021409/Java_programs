package com.company;

class MyThr1 extends Thread{
    public MyThr1(String Name){
        super(Name);
    }
    @Override
    public void run(){
        int i = 10;
        while(i>0){
            System.out.println("Name of the Thread is: "+ this.getName());
            i--;
        }
    }
}

public class CWH_PrioritiesInMultiThreading {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Yash sharma");
        MyThr1 t2 = new MyThr1("Yash1 sharma");
        MyThr1 t3 = new MyThr1("Yash2 sharma");
        MyThr1 t4 = new MyThr1("Yash3 sharma");
        MyThr1 t5 = new MyThr1("Yash4 sharma");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
