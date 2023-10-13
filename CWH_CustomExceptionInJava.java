package com.company;

import java.util.Scanner;

class EXC extends Exception{
    public String toString(){
        return "Debarred";
    }
    public String getMessage(){
        return "Not FullFill the Attendance criteria";
    }
}

public class CWH_CustomExceptionInJava {

    public static void happend(int percentage) throws EXC{
        if(percentage<75){
            throw  new EXC();
        }
//        return false;
    }

    public static void main(String[] args) {
        int percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        percentage = sc.nextInt();

        try{
            happend(percentage);
            System.out.println("pass with percentage: "+percentage);
        }
        catch (EXC e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
