package com.company;
import java.util.Scanner;

public class JavaProg1Exc {
    public static void main(String[] args) {
        Scanner TakeInput = new Scanner(System.in);
        System.out.print("Enter Marks in Sub1: ");
        float m1 = TakeInput.nextFloat();
        System.out.print("Enter Marks in Sub2: ");
        float m2 = TakeInput.nextFloat();
        System.out.print("Enter Marks in Sub3: ");
        float m3 = TakeInput.nextFloat();
        System.out.print("Enter Marks in Sub4: ");
        float m4 = TakeInput.nextFloat();
        System.out.print("Enter Marks in Sub5: ");
        float m5 = TakeInput.nextFloat();

        float sum = (m1+m2+m3+m4+m5);
        float Perc = (sum/500)*100;      // (getmarks/total marks )*outof 100

        System.out.print("Percentage of Student: ");
        System.out.println(Perc);
    }
}
