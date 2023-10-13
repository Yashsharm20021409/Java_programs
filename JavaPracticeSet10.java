package com.company;

////Ques1
//abstract class pen
//{
//    String s;
//    abstract public void write(String s);
//    abstract public void reFill();
//}
//
//class PenChild extends pen
//{
//    @Override
//    public void write(String s) {
//        this.s = s;
//        System.out.println("Writing: "+s);
//    }
//
//    @Override
//    public void reFill() {
//        System.out.println("Refilling pen...");
//    }
//}
//
//// Ques 2
//
//class FountainPen extends pen
//{
//    public void changeNib(String s1) {
//        System.out.println("From Which type of nib you written: "+s1);
//    }
//    @Override
//    public void write(String s) {
//        this.s = s;
//        System.out.println("Writing: "+s);
//    }
//
//    @Override
//    public void reFill() {
//        System.out.println("Refilling pen...");
//    }
//
//
//}

//Ques 3

interface BasicAnimal
{
    void sleep();
    void eat();
}

class Monkey
{
    public void jump(String S1)
    {
        System.out.println("Hey Monkey "+S1 +"On this Banana tree");
    }
    public void bite()
    {
        System.out.println("This Monkey does not Harm you! Not bite ");
    }
}

class Human extends Monkey implements BasicAnimal
{
    @Override
    public void jump(String s1)
    {
        System.out.println("Hi Monkey "+s1);
    }
    @Override
    public void bite()
    {
        System.out.println("Don't Bite");
    }

    public void sleep()
    {
        System.out.println("Sleeping");
    }
    public void eat()
    {
        System.out.println("Eating");
    }
}

public class JavaPracticeSet10 {
    public static void main(String[] args) {
        // Ques 1
//        PenChild ob = new PenChild();
//        ob.write("Hi i am yash sharma how are you all!");
//        ob.reFill();//

        //Ques 2
//        FountainPen ob = new FountainPen();
//        ob.changeNib("Bold Blue");
//        ob.write("Hi i am yash sharma how are you all!");
//        ob.reFill();

        //Ques 3
//        Monkey ob = new Monkey();
//        ob.jump("Jump");
//        ob.bite();
//
//        System.out.println("\n");
//
//        //Note:- if we run function of monkey by object of human and reference is also of human class then override
//        //       function run not the function present in parent class(monkey)
//        Human ob1 = new Human();
//        ob1.jump("Carry");
//        ob1.bite();
//        ob1.sleep();
//        ob1.eat();
//
//        // Note:- if reference belongs to class monkey but object belongs to human class then override function
//        //        will run but through this you can not run the method of interface because only interface
//        //        is implement by human not by monkey class
//        Monkey ob2 = new Human();
//        ob2.bite();
//        ob2.jump("tiktaktoe");

        //Ques 4
    }
}
