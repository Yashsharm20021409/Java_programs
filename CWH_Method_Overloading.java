package com.company;

public class CWH_Method_Overloading {
    /*
    method Overloading Can not be performed by Changing return Type of a function/method
   */
    void foo() {
        System.out.println("Hey Good Morning! Yash How Are You");
    }

    void foo(String str) {
        System.out.println("Hey Good Morning! " + str + " How Are You");
    }

    static void foo(int a){
        System.out.println(a);
    }

//    main method overloading
    //    public static void  main(){
//        System.out.println("hello guys");
//    }
//
//    public static void main(Integer[] args) {
//
//    }

    //    public static void main(Character[] args) {
//
//    }
//
//    public static void main(int a,int b) {
//
//    }
    public static void main(String[] args) {
        String Str = "Yash";
        CWH_Method_Overloading obj = new CWH_Method_Overloading();

        System.out.println("Function/Method Overloading Start...");
        obj.foo();
        obj.foo(Str);
        foo(1);
        System.out.println("Function/Method Overloading Occur Successfully...");
    }
}
