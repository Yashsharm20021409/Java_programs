package com.company;

/* one program only have one public class other one either private or protected
* by default:- Default(with in package)/PRIVATE(outside the package it become private)
* Custom :- PRIVATE,PROTECTED
* for method and Attributes(variable) of class
* with in package method by default access specifier is default and outside package it will become  private
*/
//Note:- there is no keyword default  In Java, the default access specifier for methods is package-private (also known as default or package-private access). This means that if you don't explicitly specify an access modifier for a method, it is accessible only within the same package. Methods with default access can't be accessed from classes in other packages, even if they inherit from the class containing the method.
//private class Employee
class Employee
{
//    private int id;
     int id;
    String Name;
//    public void  Display()
//    {
//        System.out.println("Id Of Employee: "+id);
//        System.out.println("Name Of Employee: "+Name);
//  }
     void  Display()
    {
        System.out.println("Id Of Employee: "+id);
        System.out.println("Name Of Employee: "+Name);
    }

}

public class CWH_CustomClass
{
    public static void main(String[] args) {
        System.out.println("Creating Custom Class...");
        /* Creating(instantiating) Object of Class Employee */
        Employee obj = new Employee();
        obj.id = 32;
        obj.Name = "Yash Sharma";

//        System.out.println(obj.id);
//        System.out.println(obj.Name);
        // or
        obj.Display();
    }
}