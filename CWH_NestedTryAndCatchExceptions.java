package com.company;

import java.util.Scanner;

public class CWH_NestedTryAndCatchExceptions {
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        arr[0] = 56;
        arr[1] = 58;
        arr[2] = 34;
        arr[3] = 90;
        arr[4] = 88;

        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter the Array index: ");
                int ind = sc.nextInt();
                System.out.println("Welcome to Nested Try-catch");
                try {
                    System.out.println("Value at given index: " + arr[ind]);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Sorry index is out of bound");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
                flag = false;
            }
        }
        System.out.println("Thanks for using this program");
    }
}
