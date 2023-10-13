package com.company;

interface Calling
{
    long  Number = 639758450;
    void callNumber();
    void pickCall();
}
interface MyCamera
{
    void takeSnap();
    void recording();
}
interface MyWifi
{
    String[] getNetworks();
    void takeNetwork(String Network);
}

class MyCellPhone implements Calling
{
    public void callNumber()
    {
        System.out.println("Ringing..."+Number);
    }
    public void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera ,MyWifi
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

public class CWH_InterFace2 {
    public static void main(String[] args) {
//        MyWifi ob1 = new MySmartPhone();  also possible but able to run only this interface method
        MySmartPhone obj = new MySmartPhone();
        obj.callNumber();
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
