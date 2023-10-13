package com.company;
import java.util.*;

/*
 1. You can create multiple interface and concept of multiple inheritance of interface is applied here as shown
 2. you can create properties in interface(variable) but they are final,so you can't modify them after declare but
    you can overwrite them in class by redeclare in class which is not good(shown below)
 3. properties Must be default or public never private in interface
 4. Method of interface mus be public in class
 5. See in both interface there is two method with same Name(greet) this ambiguity is automatically solved in java
*/

interface ByCycle
{
    int a = 90;
    public void speedUp(int  incremnet);
    public void applyBrake(int decrement);
//  public void Greet(int a);as compare to method in below interface both are different because of signature(float,int)
    public void Greet();
}
interface HornOfCycle
{
//    public void Greet(float a);
    void Greet();
    public void Horn1();
    public void Horn2();
}

class cycle implements ByCycle,HornOfCycle
{
    private int speed = 80;
//    a = 89  give error because a is property of interface which is final
    // override property of interface
    //private int a = 89;// point no. 2
//    speed = speed - 10; Not allowed read point no 2

    public void speedUp(int increment)
    {
        speed = speed +increment;
        System.out.println("Speed up..."+speed);
        System.out.println("Value of a "+a);
    }
    public void applyBrake(int decrement)
    {
        speed = speed-decrement;
        System.out.println("Apply Brake..."+speed);
    }
    public void Horn1()
    {
        System.out.println("AnyType");
    }
    public void Horn2()
    {
        System.out.println("Customize Type");
    }
    public void Greet()
    {
        System.out.println("Hi Friend");
    }
}
public class CWH_InterFace {
    public static void main(String[] args)
    {
        cycle ob = new cycle();
        ob.speedUp(7);
        ob.applyBrake(9);
        ob.Horn1();
        ob.Horn2();
        ob.Greet();
    }
}
