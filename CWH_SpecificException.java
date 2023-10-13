package com.company;

import java.util.Scanner;

public class CWH_SpecificException {
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        arr[0] = 56;
        arr[1] = 58;
        arr[2] = 34;
        arr[3] = 90;
        arr[4] = 88;


        System.out.print("Enter the Array index: ");
        int ind = sc.nextInt();
        System.out.print("Enter the Number for divide: ");
        int num = sc.nextInt();

        try{
            System.out.println("Number at given index of array is: "+arr[ind]);
            System.out.println("Number after divide array-value/Number: "+arr[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException is occurred, Reason:");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is occurred, Reason:");
            System.out.println(e);
        }
        catch (Exception e){//important this one block to face for other kind of exceptions
            System.out.println("Some other Exception is occurred, Reason:");
            System.out.println(e);
        }
    }
}
