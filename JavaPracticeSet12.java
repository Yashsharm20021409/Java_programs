package com.company;

import java.util.Scanner;

class MaxTriesExceeded extends Exception{
    @Override
    public String toString(){
        return "You have reached maximum limit";
    }
    @Override
    public String getMessage(){
        return "Maximum limit reached";
    }

}

public class JavaPracticeSet12 {
    public static void main(String[] args) throws MaxTriesExceeded {

        // Problem 2

//        try{
//            int a = 666/-1;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }

        // 3) Write a program that allows you to keep access array till invalid index. If max retries exceed 5 print "errors".

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 24;
//        arr[1] = 14;
//        arr[2] = 20;
//        arr[3] = 64;
//        arr[4] = 44;
//        int index, i = 0;
//        while(i<5) {
//            try {
//                System.out.print("Enter the Index: ");
//                index = sc.nextInt();
//                System.out.print("Value at given index: "+arr[index]);
//                break;
//            }
//            catch (Exception e){
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }

        //4) Modify program in Q3 to throw a custom Exception if max retries are reached.


//        For Question 4 ->
        int [] array1 = {11, 22, 33, 44, 55, 66};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (i < 5) {
            try {
                System.out.print("Enter index : ");
                index = sc.nextInt();
                System.out.println( "The value of marks at index  " + index + " is " + array1[index]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e ){
                System.out.println("Enter valid index");
            }
            i++;
        }
        if (i >= 5){
            throw new MaxTriesExceeded();
        }

    }
}