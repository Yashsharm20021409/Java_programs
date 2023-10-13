package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class ArrayDemo{
    public void ArrayFunc(int arr[],int key,int n){
       // Arrays.sort(arr);
        int flag = 0;
        int i,j;

        for(i = 0 ; i< n;i++){
            for(j = i+1; j<n ; j++){
                if(arr[i]+arr[j] == key){
                    flag = 1;
                    System.out.println("Pair: "+arr[i] +" "+arr[j]);
                }
            }
        }
        if(flag == 0){
            System.out.println("No pair found");
        }
    }

    public void ArrayFunc(int A[],int B[],int n1,int n2){
        int k1 = 0;
        int k = n1+n2;
        int i = 0;
        int j = 0;
        int []C = new int[k];

        while(i<n1 && j<n2){
            if(A[i]<B[j]){
                C[k1] = A[i];
                i++;
                k1++;
            }
            else{
                C[k1] = B[j];
                j++;
                k1++;
            }
        }
        while(i<n1){
           C[k1] = A[i];
           i++;
           k1++;
        }

        while(j<n2){
            C[k1] = B[j];
            j++;
            k1++;
        }

//        for(int a = 0 ; a<k ; a++){
//            System.out.println("Element: "+C[a]);
//        }
//
        i = j = 0;
        int a = 0;
        for(a = 0 ; a < k; a++){
            if(a<n1){
                A[i] = C[a];
                i++;
            }
            else{
                B[j] = C[a];
                j++;
            }
        }
    }
}

public class LabQues {
    public static void main(String []args){
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of An array: ");
        size = sc.nextInt();

        int []Arr  = new int[size];

        System.out.println("Enter Element into the array ");
        for (int i = 0 ; i<size ; i++) {
            System.out.print("Enter Element ");
            Arr[i] = sc.nextInt();
        }

//        System.out.print("Enter key: ");
//        int key = sc.nextInt();
//
        ArrayDemo ob = new ArrayDemo();
//        ob.ArrayFunc(Arr,key,size);

        //Array2

        System.out.print("Enter size of An array: ");
        int size1 = sc.nextInt();

        int []Arr1  = new int[size1];

        System.out.println("Enter Element into the array ");
        for (int i = 0 ; i<size1 ; i++) {
            System.out.print("Enter Element ");
            Arr1[i] = sc.nextInt();
        }

        ob.ArrayFunc(Arr,Arr1,size,size1);

        System.out.println("Array After Merge And sort");
        System.out.println("Arr");
        for(int i = 0 ; i<size ; i++){
            System.out.println("Element: "+Arr[i]);
        }
        System.out.println("Arr1");
        for(int j = 0 ; j<size1 ; j++){
            System.out.println("Element: "+Arr1[j]);
        }
    }
}
