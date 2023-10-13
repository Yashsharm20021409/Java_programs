package com.company;
import java.util.Scanner;

public class JavaPracticeSet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int []Arr = new int[5];
//        boolean flag = false;
//
//        System.out.println("Enter Data into the Array...");
//
//        for(int i = 0 ; i<Arr.length ; i++)
//        {
//            System.out.printf("Enter Element %d: ",i+1);
//            Arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter value to be Checked Present in array: ");
//        int value = sc.nextInt();
//
//        for(int i = 0 ; i<Arr.length ; i++)
//        {
//            if(Arr[i] == value)
//            {
//                flag = true;
//                break;
//            }
//        }
//
//        if(flag)
//        {
//            System.out.println(value+" is Found in given Array");
//        }
//        else
//        {
//            System.out.println(value+" is Not Found in given Array");
//        }

        //  Question 4


        int [][]mat1 = {{1,2,3},{4,5,6}};
        int [][]mat2 = {{2,6,13},{3,7,1}};
        int [][]result = {{0,0,0},{0,0,0}};

        int row = mat1.length;
        int col = mat1[0].length;

        for (int i = 0 ; i<mat1.length ; i++)
        {
            for (int j = 0 ; j < mat1[i].length ; j++) // array in array 2 row = 2 array mat[0].length mat[1].length
            {
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("Print Result Matrix....");

        for (int i = 0 ; i < mat1.length ; i++)
        {
            for (int j = 0 ; j < mat1[i].length; j++)
            {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
