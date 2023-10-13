/*
1. What will be the result of the following expression:
   float a = 7/4 * 9/2
2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
4. Write the following expression in a java program:
   (v^2-u^2)/2as
5. Find the value of 'a' in expression given below :
   int x = 7
   int a = 7*49/7 + 35/7
*/

package com.company;
import java.util.Scanner;

public class JavaPracticeSet2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // ques 2

//        char Grade = 'A';
//        // encrypt
//        Grade = (char)(Grade + 8);  // int is bigger then char it become int that why we typecast this
//        System.out.println(Grade);
//        //Decrypt
//        Grade = (char)(Grade - 8);
//        System.out.println(Grade);

        // ques 4

          System.out.print("Enter Value of v: ");
          int v = sc.nextInt();
          System.out.print("Enter Value of u: ");
          int u = sc.nextInt();
          System.out.print("Enter Value of a: ");
          int a = sc.nextInt();
          System.out.print("Enter Value of s: ");
          int s = sc.nextInt();

          double res = (double)((v*v-u*u)/(2*a*s));

          System.out.println("Result of above Given Equation is: "+res);

    }
}
