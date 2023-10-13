package com.company;

final class FinalClass{
    public int id;
    public static String Name;

    public void printDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+Name);
    }
}

//Give errors to you

//class FinalClass2 extends FinalClass{
//    @Override
//    public void printDetails() {
//        super.printDetails();
//    }
//}

public class FinalClassInJava {
    public static void main(String[] args) {
        FinalClass ob = new FinalClass();
        ob.id = 1001;
        FinalClass.Name = "yash";
        ob.printDetails();
//        FinalClass2 ob1 = new FinalClass2();
//        ob1.printDetails();
    }
}
