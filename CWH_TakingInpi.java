package com.company;
import java.util.Scanner;

public class CWH_TakingInpi {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");
        /*
        * Scanner:- it is a class
        * sc = is a object of class scanner which we have created
        */
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Number1: ");
//        int Num1 = sc.nextInt();
//        System.out.print("Enter Number2: ");
//        int Num2 = sc.nextInt();
//
//        int Sum = Num1+Num2;
//        System.out.print("Sum of Two Number is: ");
//        System.out.println(Sum);
//
//        System.out.print("Enter Number1: ");
//        float f1 = sc.nextFloat();
//        System.out.print("Enter Number1: ");
//        float f2 = sc.nextFloat();
//
//        float SumF = f1+f2;
//
//        System.out.print("Sum of Two floating Number is: ");
//        System.out.println(SumF);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str1 = sc.next();    // print one word from line
        String str = sc.nextLine();  // print while line
        System.out.println(str);
//        System.out.println(str1);
    }
}
