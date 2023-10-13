package com.company;

class A
{
    public void Yash()
    {
        System.out.println("I am Method 1 Of Base Class ");
    }
}

class B extends A
{
    @Override
    public void Yash()
    {
        System.out.println("I am OverRide Method 1 of Derived class");
    }
}

public class CWH_Method_OverRide {
    public static void main(String[] args) {
        // condition 1
        A a = new A();
        a.Yash();
        // condition 2

        B b = new B();
        b.Yash();
        // condition 3

        A a1 = new B();
        a1.Yash();
    }
}
