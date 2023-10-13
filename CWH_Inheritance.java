package com.company;

class Base
{
    private int x;

    public void setX(int x) {
        System.out.println("Setting value of X");
        this.x = x;
    }
    public int getX() {
        System.out.println("Return Value of X");
        return x;
    }
    void DisplayBase()
    {
        System.out.println("Hi this is SuperClass");
    }
}

class Derived extends Base
{
    private int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    void DisplayDerived()
    {
        System.out.println("Hi this is SubClass");
    }
}

public class CWH_Inheritance {
    public static void main(String[] args) {
        Base ob = new Base();
        ob.setX(89);
        System.out.println("Value of X: "+ob.getX());
        ob.DisplayBase();

        //  you can access property/method of superclass by subclass object

        Derived od = new Derived();
        od.setX(99);
        System.out.println("Value of X: "+od.getX());
        od.DisplayBase();
        // But not access property/method of subclass by superclass object

        //gives error
//        ob.setY(99);
//        System.out.println("Value of X: "+ob.get(Y));
//        od.DisplayDerived();

        od.setY(99);
        System.out.println("Value of X: "+od.getY());
        od.DisplayDerived();
    }
}
