package com.company;
import java.util.Scanner;

class CircleCheck
{
    private float Radius;
    private float Area;

    public void Setter(float radius,float area)
    {
        this.Radius = radius;
        this.Area = area;
    }
    public boolean Greater()
    {
        float Area1 = (float) (3.14*Radius*Radius);

        if(Area1 == Area)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class CWH_AccessModifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        access modifier chart example
//        Employee obj1 = new Employee();
//        obj1.Display();

        System.out.print("Enter the Radius of a Circle: ");
        float Radius = sc.nextFloat();
        System.out.print("Enter the Area to set: ");
        float Area = sc.nextFloat();

        CircleCheck check = new CircleCheck();
        check.Setter(Radius,Area);

        if(check.Greater())
        {
            System.out.println("Given Area is Equal to the Area of Circle Calculated");
        }
        else
        {
            System.out.println("Given Area is Not Equal to the Area of Circle Calculated");
        }
    }
}
