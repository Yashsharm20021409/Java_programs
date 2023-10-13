package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
//        return super.toString()+ " I am toString()";
        return " I am toString()";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + " I am getMessage()";
        return  " I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class ExceptionClassInJava {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        a = sc.nextInt();

        if(a<9){
            try {
//                throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch (Exception e){
                System.out.println("Reason of failure is: "+e.getMessage());
                System.out.println("Reason of failure is: "+e.toString());
                System.out.println(e); // toString() method will execute for this
                e.printStackTrace();  // shows in which line error comes and due to which function
            }
        }
    }
}
