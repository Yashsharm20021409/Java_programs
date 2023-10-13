package com.company;
import java.util.Scanner;

public class JavaPracticeSet7 {

    int Sum(int N)
    {
        if(N == 1)
        {
            return 1;
        }
        return N + Sum(N-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaPracticeSet7 obj = new JavaPracticeSet7();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;

        sum = obj.Sum(N);
        System.out.println("Sum of N Natural Number is Sum: "+sum);
    }
}
