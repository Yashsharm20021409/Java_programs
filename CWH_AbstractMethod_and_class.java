package com.company;

abstract class Phones
{
    private int Price;
    public void PriceRange(int Price)
    {
        this.Price = Price;
        Display();
    }
    public abstract void on();
    private void Display()
    {
        System.out.println("Price of Redmi Note 10 Pro max is "+Price);
        System.out.println("Price of Samsung s10 is "+Price);
        System.out.println("Price of RealMe 5i is "+Price);
    }
}

class RedmiPhones extends Phones
{
    public void on()
    {
        System.out.println("Redmi Note10 Pro Max");
    }
}

class SamsungPhones extends Phones
{
    public void on()
    {
        System.out.println("Samsung s10");
    }
}

class RealMePhones extends Phones
{
    public void on()
    {
        System.out.println("RealMe Powered By oppo");
    }
}

// if any subclass extends from any Abstract superclass then in subClass we have to use all the
// Abstract method of that abstract class otherwise you will get error if you don't Want to do
// so simply declare that subclass as abstract class Also

abstract class AllRating extends Phones
{
    public void Rating()
    {
        System.out.println("Rating of Redmi Phones");
        System.out.println("****/5");
        System.out.println("Rating of Samsung Phones");
        System.out.println("****/5");
        System.out.println("Rating of RealMe Phones");
        System.out.println("****/5");
    }
}

public class CWH_AbstractMethod_and_class {
    public static void main(String[] args) {
        // we create Reference variable of Abstract phone class because there is some non-Abstract Methods which
        // we have to run using Reference variable creation of object of abstract class is not allowed
        // to Run those methods object we can make anyone of class object which extends from Phones class
        // and phone class is abstract type ,so we can not create object of that abstract class
        // you can also run those methods with the help of inherited class object we did this just to make code
        // readable and understandable what actually happen

//        Phone obj = new Phones(); ---> Gives Error
        Phones obj = new RealMePhones();
        RedmiPhones ob1 = new RedmiPhones();
        SamsungPhones ob2 = new SamsungPhones();
        RealMePhones ob3 = new RealMePhones();

//        obj.PriceRange(15000); or
        ob1.PriceRange(7483);
        ob1.on();
        ob2.on();
        ob3.on();
//        AllRating obj = new AllRating();--> Gives error
    }
}
