package com.company;

import javax.sound.midi.Soundbank;

public class CWH_DifferntWaysOfPrinting {
    public static void main(String[] args) {
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b); // 8 = space .2 = digit print after decimal
        System.out.format("The value of a is %d and value of b is %f\n", a, b);
        System.out.println("The value of a: "+a+" The value of b: "+b);
        System.out.print("The value of a: "+a+" The value of b: "+b);
    }
}
