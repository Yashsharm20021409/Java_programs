package com.company;

/* Key points:- Constructor behaviour during inheritance

 1 if there is no constructor in derived class. you have created object of derived class
  the  that object will invoke the constructor of base class without any fail

 2.id there is constructor present in derived class and base class both .but you created only
  derived class object then (1. base Class Constructor will be called!) then (Derived class constructor called)

 3.if there is more than one constructor in base class 1 is without argument 1 is with argument and there is
   only 1 constructor in derived class which is also without argument constructor then you just created derived
   class object then base class constructor without argument will be called but if you want to called constructor
   of base class with argument you have to you (super keyword)

 4.if there is 3 class as shown (in class 7) if you pass parameters in object but not use super keyword in 2 class
   then constructor of class of which we use object that class parameter constructor invoked other class
   without parameter constructor will invoke but on use super keyword all parameter constructor will be called
*/

// class 1

//class Base1
//{
//    Base1()
//    {
//        System.out.println("Constructor of Base Class Called!!!");
//    }
//}
//
//class Derived1 extends Base1
//{
//    Derived1()
//    {
//        System.out.println("Constructor of Derived Class Called!!!");
//    }
//}

// class 3

//class Base1
//{
//    Base1()
//    {
//        System.out.println("Constructor of Base Class Called!!!");
//    }
//    Base1(int x)
//    {
//        System.out.println("Constructor of base class with value: "+x);
//    }
//}
//
//class Derived1 extends Base1
//{
//    Derived1()
//    {
//        super(9);
//        System.out.println("Constructor of Derived Class Called!!!");
//    }
//
//}

// class 5
//
//class Base1
//{
//    Base1()
//    {
//        System.out.println("Constructor of Base Class Called!!!");
//    }
//    Base1(int x)
//    {
//        System.out.println("Constructor of base class with value: "+x);
//    }
//}
//
//class Derived1 extends Base1
//{
//    Derived1()
//    {
//        System.out.println("Constructor of Derived Class Called!!!");
//    }
//
//    Derived1(int x,int y)
//    {
//        // both valid
////        super(x);
//        super(y);
//        System.out.println("Constructor of Derived Class Called with value: "+x);
//    }
//
//}

// class 7

class Base1
{
    Base1()
    {
        System.out.println("Constructor of Base Class Called!!!");
    }
    Base1(int x)
    {
        System.out.println("Constructor of base class with value: "+x);
    }
}

class Derived1 extends Base1
{
    Derived1()
    {
        System.out.println("Constructor of Derived Class Called!!!");
    }

    Derived1(int x,int y)
    {
        super(x);  // if you not use this then base class default constructor get invoked
        System.out.println("Constructor of Derived Class Called with value: "+x);
    }

}

class ChildDerived extends Derived1
{
    ChildDerived()
    {
        System.out.println("Child Derived class constructor called!!!");
    }

    ChildDerived(int x,int y,int z)
    {
//        super(x); give error
        super(x, y);
        System.out.println("Child Derived class constructor called with value: "+z);
    }
}

public class CWH_Constructor_InInheritance {
    public static void main(String[] args) {
        // for class 1
        Base1 b = new Base1();
        Derived1 d = new Derived1();

        // for class 3
//        Derived1 d= new Derived1();

        // for class 5
//        Derived1 d = new Derived1(7,8);

        // for class 7
//        ChildDerived cd1 = new ChildDerived();
//        ChildDerived cd2 = new ChildDerived(6);  // both line give error
//        ChildDerived cd3 = new ChildDerived(3,4);
//        ChildDerived cd = new ChildDerived(8,10,18);
    }
}
