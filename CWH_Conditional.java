package com.company;
import java.util.Scanner;

public class CWH_Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("This Boy/Girl is Eligible To Drive Vehicle");
        }
        else
        {
            System.out.println("This Boy/Girl is Not Eligible To Drive Vehicle");
        }
    }
}
