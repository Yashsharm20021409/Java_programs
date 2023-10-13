package com.company;
import java.util.Scanner;

public class CWH_Conditional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the age: ");
//        int age = sc.nextInt();

        System.out.print("Enter your Name: ");
        String Name = sc.next();

//        switch(age)
//        {
//            case 18:
//                System.out.println("You Are Going to Become Adult\n");
//                break;
//            case 23:
//                System.out.println("You Are Going To Join Job Now\n");
//                break;
//            case 68:
//                System.out.println("You Are Going To Get Retired Now\n");
//                break;
//            default:
//                System.out.println("Enjoy Your Life Buddy\n");
//                break;
//        }

        switch (Name)
        {
            case "Yash":
                System.out.println("Hi Yash Welcome Back!");
                break;
            case "Love":
                System.out.println("Hi Love Welcome Back!");
                break;
            default:
                System.out.println("Error!!!\n");
                break;
        }
        System.out.println("Thanks To Use My Code.\n");
    }
}
