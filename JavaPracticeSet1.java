/*
1. Write a program to sum three numbers in Java.
2. Write a program to calculate CGPA using marks of three subjects (out of 100)
3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
4. Write a Java program to convert Kilometers to miles.
5. Write a Java program to detect whether a number entered by the user is an integer or not.
*/

package com.company;
import java.util.Scanner;

public class JavaPracticeSet1 {
    public static void main(String[] args) {
      Scanner ob = new Scanner(System.in);

      // ques 3
//        System.out.print("Enter your Name: ");
//        String Name = ob.next();
//
//        System.out.println("Hello "+ Name +",Have a Good Day");
//
      // ques 4
//        System.out.print("Enter your Distance in km: ");
//        double KM = ob.nextDouble();
//
//        double miles = KM * 0.62137;
//
//        System.out.println(KM + "Distance in mile is: "+ miles);

        // ques 5
          System.out.println("Enter your number");
          Scanner sc = new Scanner(System.in);
          System.out.println(sc.hasNextInt());

    }
}
