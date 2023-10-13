/*
1.Create a class Employee with the following properties and methods:
  .Salary (property) (int)
  .getSalary (method returning int)
  .name (property) (String)
  .getName (method returning String)
  .setName (method changing name)
2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
4.Create a class Rectangle & problem 3.
5.Create a class TommyCalvetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
6.Repeat problem 4 for a circle.
*/


package com.company;
import java.util.Scanner;

// question 1

class Employers
{
    int Salary ;
    String Name ;

    public int getSalary()
    {
        return Salary;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }
}

// question 2

class CellPhone
{
    public void Ring()
    {
        System.out.println("Phone is Ringing...");
    }
    public void Vibrate()
    {
        System.out.println("Phone is Vibrating...");
    }
    public  void Calling()
    {
        System.out.println("Calling Mayank...");
    }
}

// question 3

class Square
{
    float side;
    float Area;
    float perimeter;

    public void setParameters(float Side)
    {
        side = Side;
    }
    public float areaOfSquare()
    {
        Area = side*side;
        return Area;
    }
    public float perimeterOfSquare()
    {
        perimeter = 4*side;
        return perimeter;
    }
}

// question 4

class Rectangle
{
    float length;
    float width;
    float Area;
    float perimeter;

    public void setParameters(float Length,float Width)
    {
        length = Length;
        width = Width;
    }
    public float areaOfSquare()
    {
        Area = length*width;
        return Area;
    }
    public float perimeterOfSquare()
    {
        perimeter = 2*(length+width);
        return perimeter;
    }
}

// question 5

class Tommy
{
    public void Run()
    {
        System.out.println("Running From Police");
    }
    public void Hit()
    {
        System.out.println("Hitting the Enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the Enemy");
    }
}

public class JavaPracticeSet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
//        Employers emp = new Employers();
//
//        System.out.print("Enter Employee Salary: ");
//        int Salary = sc.nextInt();
//        System.out.print("Enter Employee Name: ");
//        String Name = sc.next();
//
//        emp.Salary = Salary;
//        emp.Name = Name;
//        emp.setName(Name);
//        System.out.println("Salary of Employee: "+emp.getSalary());
//        System.out.println("Employee Name: "+emp.getName());

        // Questions 2

//        CellPhone Asus = new CellPhone();
//        Asus.Ring();
//        Asus.Vibrate();
//        Asus.Calling();

        // Question 3

//        Square perimeter = new Square();
//
//        System.out.print("Enter side of a Square: ");
//        float Side = sc.nextFloat();
//        perimeter.setParameters(Side);
//        System.out.println("Area of Square is: "+perimeter.areaOfSquare());
//        System.out.println("Perimeter of Square is: "+perimeter.perimeterOfSquare());

        // Question 4

//        Rectangle perimeterOfRectangle = new Rectangle();
//
//        System.out.print("Enter Length of Rectangle: ");
//        float Length = sc.nextFloat();
//        System.out.print("Enter Width of Rectangle: ");
//        float Width = sc.nextFloat();
//
//        perimeterOfRectangle.setParameters(Length,Width);
//        System.out.println("Area of Rectangle: "+perimeterOfRectangle.areaOfSquare());
//        System.out.println("Perimeter of Rectangle: "+perimeterOfRectangle.perimeterOfSquare());

        // Question 5

//        Tommy RockStar = new Tommy();
//
//        RockStar.fire();
//        RockStar.Hit();
//        RockStar.Run();
    }
}
