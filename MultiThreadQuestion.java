package com.company;
import java.util.*;

class PPThread extends Thread{
    int n;
    public void set(int n1){
        n = n1;
    }
    public void run(){
        int sum = 0+n;
        System.out.println("Sum: "+sum);
    }
}
class PPThread1 implements Runnable{
    public void run(){
        int n = 0;
        System.out.println("n: "+n);
    }
}
public class MultiThreadQuestion {
    public static void main(String[] args) {
        PPThread ob = new PPThread();

        ob.set(2);
//         ob.run(1);
        ob.start();

//        PPThread1 st = new PPThread1();
//        Thread e = new Thread(st);

//        e.start();
    }
}
