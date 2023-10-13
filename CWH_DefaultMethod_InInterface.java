package com.company;

/*
1. DefaultMethod in java :- In this we can modify over interface by using default keyword we can declare and define
   body of method and by using this default method we can access private member of interface
2. if interface default method is overridden in class then class method will execute
3. We can access this default function by class which implement that interface
*/
interface Calling1
{
    long  Number = 91;
    void callNumber();
    void pickCall();
    private void displayCountry()
    {
        System.out.print("India +91");
    }
    default void display()
    {
        displayCountry();
        System.out.println("6397584502");
    }
}
interface MyCamera1
{
    void takeSnap();
    void recording();
}
interface MyWifi1
{
    String[] getNetworks();
    void takeNetwork(String Network);
}

class MyCellPhone1 implements Calling1
{
    @Override
    public void callNumber()
    {
        System.out.println("Ringing...");
    }
    public void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements MyCamera1 ,MyWifi1
{

    @Override
    public String[] getNetworks()
    {
        System.out.println("Networks Available");
        String []Networks = {"Redmi","Airtel","JioFiber"};
        return Networks;
    }

    @Override
    public void takeNetwork(String Network) {
        System.out.println("Connecting to "+Network);
    }

    public void takeSnap()
    {
        System.out.println("Taking Photo");
    }
    public void recording()
    {
        System.out.println("Recording Video");
    }
}


public class CWH_DefaultMethod_InInterface {
    public static void main(String[] args) {
        MySmartPhone1 obj = new MySmartPhone1();

        obj.callNumber();
        obj.display();
        obj.pickCall();
        String []arr = obj.getNetworks();
        // String ite;
        for (String item:arr) {
            System.out.println(item);
        }
        String Network = arr[0];
        obj.takeNetwork(Network);
        obj.takeSnap();
        obj.recording();
    }
}
