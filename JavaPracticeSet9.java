package com.company;
class Base2
{
    public Base2()
    {
        System.out.println("I am constructor of a Base2 Class");
    }
    public void on()
    {
        System.out.println("Hi Parents");
    }
}
class Derived2 extends Base2
{
    public Derived2()
    {
        System.out.println("I am Constructor of Derived2 Class");
    }
    public void on()
    {
        System.out.println("Hi child of parents");
    }
}
class Derived3 extends Derived2
{
    public Derived3()
    {
        System.out.println("I am constructor of Derived3 class");
    }
    public void on()
    {
        System.out.println("Hi child of child of parents");
    }
}
public class JavaPracticeSet9 {
    public static void main(String[] args) {
//        Derived2 obj = new Derived3();
//        obj.on();
//        Derived2 obj = new Derived2();
        Derived3 obj = new Derived3();

    }
}
