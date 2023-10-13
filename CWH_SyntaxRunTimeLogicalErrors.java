package com.company;
import java.util.Scanner;
public class CWH_SyntaxRunTimeLogicalErrors {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 and 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR
        // to get runtime error give int value k = alphabet and anything or k = 0 you will get runtime error

        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
