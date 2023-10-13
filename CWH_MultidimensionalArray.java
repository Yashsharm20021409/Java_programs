package com.company;
import java.util.Scanner;

public class CWH_MultidimensionalArray {
    public static void main(String[] args) {
        int [][]flat = new int[2][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data");

        for (int i = 0 ; i< 2 ; i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                System.out.printf("[%d][%d]: ",i,j);
                flat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i< 2 ; i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                System.out.printf("Element[%d][%d]: ",i,j);
                System.out.println(flat[i][j]);
            }
        }

        // give output like table:
        for (int i = 0 ; i< 2 ; i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
