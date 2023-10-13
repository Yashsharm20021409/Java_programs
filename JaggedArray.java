package com.company;
import java.util.*;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]Arr = new int[3][];
        int count = 0;
        Arr[0] = new int[3];
        Arr[1] = new int[2];
        Arr[2] = new int[1];

        for(int i = 0 ; i<Arr.length ; i++){
            for(int j = 0 ; j<Arr[i].length ; j++){
                Arr[i][j] = count++;
            }
        }

        System.out.println("Contents of 2D Jagged Array");
        for (int[] ints : Arr) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
