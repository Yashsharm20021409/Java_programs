package com.company;

import java.util.Scanner;

public class LabQuesRearrangeNegPos {
    public static void RearrangePosAndNeg(int[] arr, int n){
        int i = 0;
        int j = 0;

        for(i = 0 ; i<n ; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the element into the array");

        for(int i = 0 ; i <n  ; i++){
            System.out.print("Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before Rearrange");
        for(int i = 0 ; i <n  ; i++){
            System.out.println("Element: "+arr[i]);
        }
        RearrangePosAndNeg(arr,n);

        System.out.println("Array after Rearrange");
        for(int i = 0 ; i <n  ; i++){
            System.out.println("Element: "+arr[i]);
        }
    }
}
