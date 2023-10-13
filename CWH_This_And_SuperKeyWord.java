package com.company;
import java.util.*;

class EkClass
{
    private  int a;
//    private final int a;
    public EkClass(int a)
    {
        System.out.println("I amm constructor of Base Class");
        this.a = a;
    }
    public int getA()
    {
        return a;
    }

}

class DoClass extends EkClass
{

    public DoClass(int a)
    {
        super(a);
        System.out.println("I am constructor of Derived Class");
    }
}

public class CWH_This_And_SuperKeyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();

//        EkClass e = new EkClass(a);
        DoClass d = new DoClass(a);
        System.out.println("Value of Private Member of EkClass (a) is: "+d.getA());
    }
}
