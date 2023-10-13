// by implementing interface of thread i.e runnable
package com.company;

class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("This is my Thread1 not Threat1");
            i++;
        }
    }
}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i = 0 ;
        while(i<5){
            System.out.println("This is my Thread2 not Threat2");
            i++;
        }
    }
}
public class CWH_MultiThreading2 {
    public static void main(String[] args) {
        /*
          do like this to run method after implement thread(runnable) interface object name is
          anything these are just example
        */

        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
