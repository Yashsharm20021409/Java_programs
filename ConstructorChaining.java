package com.company;

class Constructor{
    public Constructor(){
        this(2);
        System.out.println("I am the default constructor ");
    }
    public Constructor(int x){
        this(4,3);
        System.out.println("I am the Parametrized Constructor with single Argument: "+x);
    }
    public Constructor(int x,int y){
        System.out.println("I am the Parametrized Constructor with double Argument: "+x+" "+y);
    }
}

public class ConstructorChaining {
    public static void main(String args[]){
        Constructor a = new Constructor();
    }
}
