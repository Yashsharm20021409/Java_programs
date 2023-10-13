package com.company;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
    // Custom Exceptions
    @Override
    public String toString() {
        return "Negative Radius Exception";
    }

    @Override
    public String getMessage() {
        return "Negative Radius Exception";
    }
}

//Throws:- indication to the programmer which type of Exception you may get
//Throw :- Throw the custom Exception as Shown below

public class CWH_ThrowANDThrows {
    public static double Area(int r) throws NegativeRadiusException{ // Class Name
        if(r<0){
            throw new NegativeRadiusException(); // Object of that class
        }
        double area = Math.PI*r*r;
        return area;
    }
    public static int Divide(int a,int b) throws ArithmeticException{ // indicate you must use try and catch
        return a/b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Division of Two Number is: "+Divide(6,0));
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
        boolean flag = true;

        while(flag) {
            System.out.print("Enter Radius: ");
            int r = sc.nextInt();
            try {
                System.out.println("Area of Circle: "+Area(r));
                flag = false;
            } catch (Exception e) {
                System.out.println("Exception: "+e);
            }
        }
    }
}
