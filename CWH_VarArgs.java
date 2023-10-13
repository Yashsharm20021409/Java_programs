package com.company;

public class CWH_VarArgs {
    static int sum1(int ...arr)
    {
        // arr available as []arr
        int Result = 0;

        for (int a:arr)
        {
            Result+=a;
        }
        return Result;
    }
    static int sum(int x,int ...arr)
    {
        // arr available as []arr
        int Result = x;

        for (int a:arr)
        {
            Result+=a;
        }
        return Result;
    }


    public static void main(String[] args) {

        // No compulsory arguments

        System.out.println("Sum of Given Number is: "+sum1()); // empty array return sum 0
        System.out.println("Sum of Given Number is: "+sum1(1));
        System.out.println("Sum of Given Number is: "+sum1(4,5));
        System.out.println("Sum of Given Number is: "+sum1(4,5,6));
        System.out.println("Sum of Given Number is: "+sum1(4,5,6,7));

        // One compulsory argument

      //  System.out.println("Sum of Given Number is: "+sum()); // give array this time
        System.out.println("\nSum of Given Number is: "+sum(1));
        System.out.println("Sum of Given Number is: "+sum(0,5));
        System.out.println("Sum of Given Number is: "+sum(0,5,6));
        System.out.println("Sum of Given Number is: "+sum(0,5,6,7));
        

    }
}
