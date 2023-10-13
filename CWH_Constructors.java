package com.company;
import java.util.Scanner;
import java.util.SortedMap;

class mainMyEmployee
{
    private String Name;
    private int Id;
    private int Salary;
    private String pos;

    /*
      1.here we use three constructor for different-2 arguments this is called constructor overloading
      2.constructor Invoke Automatically When constructor is called!
    */
    public mainMyEmployee(String name ,int id)
    {
        Name = name;
        Id = id;
    }
    public mainMyEmployee(int salary)
    {
        Salary = salary;
    }
    public mainMyEmployee(String Pos)
    {
        pos = Pos;
        System.out.println("Position of the Employee is: "+pos);
    }
    public void Display()
    {
        System.out.println("Name Of the Employee is: "+Name);
        System.out.println("Id Of the Employee is: "+Id);
    }
    public int Getter()
    {
        return Salary;
    }

}

public class CWH_Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name of the Employee: ");
        String name = sc.next();
        System.out.print("Enter id of the Employee: ");
        int id = sc.nextInt();
        System.out.print("Fix Salary: ");
        int salary = sc.nextInt();

        mainMyEmployee obj1 = new mainMyEmployee(salary);
        mainMyEmployee obj = new mainMyEmployee(name,id);
        mainMyEmployee ob2 = new mainMyEmployee("Manager");
        obj.Display();

        System.out.println("Salary of the Employee is: "+obj1.Getter());
    }
}
