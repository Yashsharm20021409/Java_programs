package com.company;

abstract class shape{
    int l,b;
    public abstract void rectangleArea(double l,double b);
    public abstract void squareArea(double a);
    public abstract void circleArea(double r);
}

class Area extends shape{

     public void rectangleArea(double l,double b){
       double area = (int) (0.5*(l*b));
        System.out.println("Area of Rectangle: "+area);
    }

    public void squareArea(double a){
        System.out.println("Area of Square: "+4*a);
    }

    public void circleArea(double r){
         double area = 3.14*(r*r);
        System.out.println("Area of Circle: "+area);
    }
}
public class LabQuesOnAbstract {
    public static void main(String[] args) {
        Area ob = new Area();

        ob.rectangleArea(6,7);
        ob.circleArea(4);
        ob.squareArea(3);
    }
}
