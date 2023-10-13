// use of join Method(notes in notebook

package com.company;
//
//class Mythr2 extends Thread{
//    public void run(){
//        int i = 0;
//        while(i<5) {
//            //  Print 10 times 5 times for t1 then for t2
//            System.out.println("Thankyou: ");
//            i++;
//        }
//    }
//}
//class Mythr3 extends Thread{
//    public void run(){
//        int i = 0;
//        while(i<5) {
//            //  Print 10 times 5 times for t1 then for t2
//            System.out.println("Thankyou thread2: ");
//            i++;
//        }
//    }
//}
//
//public class CWH_MethodInMultiThreading {
//    public static void main(String[] args) {
//        Mythr2 t1 = new Mythr2();
//        Mythr3 t2 = new Mythr3();
//
//        t1.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        t2.start();
//    }
//}


//Use of interrupt Method

class Mythr2 extends Thread{
    public void run(){
        int i =10;
        while(i>=0){
            System.out.println("Thankyou:");
            try {
                Thread.sleep(455);   // for this time t1 get stopped
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }
    }
}
class Mythr3 extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            //  Print 10 times 5 times for t1 then for t2
            System.out.println("Thankyou thread2: ");
            i++;
        }
    }
}

public class CWH_MethodInMultiThreading {
    public static void main(String[] args) {
        Mythr2 t1 = new Mythr2();
        Mythr3 t2 = new Mythr3();

        t1.start();
        t2.start();
    }
}
