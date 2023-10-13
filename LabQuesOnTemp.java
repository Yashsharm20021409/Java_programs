package com.company;

import java.util.Scanner;

abstract class Temperature{
    public static double temp;
    public void setTemp(int tem){
        temp = tem; // this is same for all class object now

    }
    abstract void changeTemp();
}

class Fahrenheit extends Temperature{
    public void changeTemp(){  // we have declared method public here but in abstract it is default but vice versa is not possible

        temp = ((temp  -  32  ) *  5)/9;
        System.out.println("Temperature in celsius " +temp);
    }
}

class Celsius extends Temperature{
    public void changeTemp(){

        temp = ((temp*9)/5)+32;
        System.out.println("Temperature in Fahrenheit: "+temp);
    }
}
public class LabQuesOnTemp {
    public static void main(String[] args) {
        Temperature obj = new Fahrenheit();
        obj.setTemp(15);

        Fahrenheit ob1 = new Fahrenheit();
        Celsius ob2 = new Celsius();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                ob1.changeTemp();
                break;
            case 2:
                ob2.changeTemp();
                break;
        }
    }
}
