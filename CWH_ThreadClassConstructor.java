package com.company;

class MyThr extends Thread{
    public MyThr(String Name){
        super(Name);
    }
    public void run(){
        int i = 5;
        while(i>=0){
            System.out.println("This is my Thread:");
            i--;
        }
    }
}

public class CWH_ThreadClassConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Yash");
        t.start();
        System.out.println("The id of the Thread is: "+t.getId());
        System.out.println("The Name of the Thread is: "+t.getName());
    }
}
