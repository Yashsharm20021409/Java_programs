package com.company;
import java.sql.SQLOutput;
import java.util.*;

class Phone
{
    public void Display()
    {
        System.out.println("Nokia 1100");
    }
    public void On()
    {
        System.out.println("Turning On the Nokia 1100");
    }
}

class SmartPhone extends Phone
{
    public void Display2()
    {
        System.out.println("Redmi Note 10");
    }
    public void On()
    {
        System.out.println("Turning on the Redmi Note-10");
    }
}

public class CWH_DynamicMethodDispatch {
    public static void main(String[] args)
    {
        Phone obj = new SmartPhone(); //Upcasting  it is Valid
        //SmartPhone obj2 = new Phone(); //Wrong This Upcasting is Not Allowed
        obj.Display();
        obj.On();

//        obj.Display2(); // Not Valid this is called
//        we have to create the reference variable object of SmartPhone Class of SubClass
        SmartPhone obj1 = new SmartPhone();
        obj1.Display2();
    }
}
