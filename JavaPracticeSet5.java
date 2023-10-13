package com.company;
import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class JavaPracticeSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Which Factor You Want To Calculate: ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = n ; i>= 1 ; i--)
        {
            // 5! = 5*4*3*2*1 = 120
            fact *=i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
