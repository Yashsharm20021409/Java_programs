package com.company;

public class CWH_TryAndCatch {
    public static void main(String[] args) {
        int a =12;
        int b=0;

        try{// if try Block is run then it prints the result and comes out of the bound
            int c = a/b;
            System.out.println("The Result is: "+c);
        }
        catch (Exception e){  //(Exception is class) here and (e) is object of that class
            System.out.println("We are failed to divide. Reason: ");
            System.out.println(e);  // e print reason
        }
        System.out.println("Program is Ended");
    }
}
