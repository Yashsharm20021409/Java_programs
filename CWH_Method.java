package com.company;

public class CWH_Method {
    // it is static method it will be same for all object(sharable among all object) and no need to
    // create object to invoke static method it invoked simply as simple function of main invoked

    static int Logic(int a,int b)
    {
        int sum = 0;
        sum = a+b;
        return sum;
    }

//    method overloading can't be performed by just changing the return type of method we need to change parameter
//    static float Logic(int a,int b)
//    {
//        int sum = 0;
//        sum = a+b;
//        return sum;
//    }

    int Logic1(int a,int b)
    {
        int sum = 0 ;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = Logic(a,b);

        System.out.println("Sum of these two number is: "+c);

        int a1 = 19;
        int b1 = 10;
        int d = Logic(a1,b1);

        System.out.println("Sum of these two number is: "+d);

        // invoke method using object of class

//        CWH_Method obj = new CWH_Method();

//        int e = obj.Logic1(a1,b);
//        int e = Logic1(a1,b); // wrong
//        System.out.println("Sum of these Two Number is: "+e);
    }
}
