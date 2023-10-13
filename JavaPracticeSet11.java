// Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads
package com.company;
//
//class J1 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(true) {
//            System.out.println("Good Morning");
//            i++;
//        }
//    }
//}
//class J2 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(true) {
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}
//public class JavaPracticeSet11 {
//    public static void main(String[] args) {
//        J1 t1 = new J1();
//        J2 t2 = new J2();
//
//        t1.start();
//        t2.start();
//    }
//}

// Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

//class J1 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(i<10) {
//            System.out.println("Good Morning");
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            i++;
//        }
//    }
//}
//class J2 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(i<10) {
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}
//public class JavaPracticeSet11 {
//    public static void main(String[] args) {
//        J1 t1 = new J1();
//        J2 t2 = new J2();
//
//        t1.start();
//        t2.start();
//    }

// Question 3: Demonstrate getPriority() and setPriority() methods in Java threads.

class J1 extends Thread{
    @Override
    public void run(){
        System.out.println("Good Morning");
    }
}
class J2 extends Thread{
    @Override
    public void run(){
        System.out.println("Welcome");
    }
}
public class JavaPracticeSet11 {
    public static void main(String[] args) {
        J1 t1 = new J1();
        J2 t2 = new J2();

        // ques 4 :- get state of thread
        System.out.println("State of Thread t1: "+t1.getState());
        System.out.println("State of Thread t2: "+t2.getState());
        

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("Priority of t1: "+t1.getPriority());
        System.out.println("Priority of t1: "+t2.getPriority());

        //Ques4
        System.out.println("State of Thread t1: "+t1.getState());
        System.out.println("State of Thread t2: "+t2.getState());

        //Ques5 get the reference to the current thread
        System.out.println("Current Ref: "+Thread.currentThread().getState());
    }
}
