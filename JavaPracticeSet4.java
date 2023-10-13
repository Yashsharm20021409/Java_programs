/*
Question 1 : What will be the output of this program:

int a = 10;
if (a=11)
        System.out.println(“I am 11”);
else
        System.out.println(“I am not 11”);
Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%  = 0.05
5.0L – 10.0L 	20% = 0.2
Above 10.0L	    30% = 0.3
Note that there is not tax below 2.5L. Take the input amount as input from the user.

Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.

Question 6:Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website
 */

package com.company;
import java.util.Scanner;


public class JavaPracticeSet4 {
    public static void main(String[] args) {
        // Ques 2
        Scanner sc = new Scanner(System.in);
//        byte m1,m2,m3;
//        System.out.print("Enter Marks in Phy: ");
//        m1 = sc.nextByte();
//        System.out.print("Enter Marks in Chem: ");
//        m2 = sc.nextByte();
//        System.out.print("Enter Marks in Maths: ");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("Congo!!! You Are passed.with "+avg+"%");
//        }
//        else
//        {
//            System.out.println("Sorry!!! Better Luck Next Time Your Score "+avg+"%");
//        }

        // Ques 3

//        System.out.print("Enter Your Salary: ");
//        double Salary = sc.nextDouble();
//        double Tax = 0;
//
//        if(Salary<2.5f)
//        {
//            Tax = Tax + 0;
//        }
//        else if(Salary >= 2.5f && Salary < 5.0f)
//        {
//            Tax = Tax + 0.05f*(Salary-2.5f);
//        }
//        else  if(Salary >= 5.0f && Salary < 10.0f)
//        {
//            Tax = Tax + 0.05f*(Salary-2.5f);
//            Tax = Tax + 0.2f*(Salary-5.0f);
//        }
//        else  if(Salary >= 10.0f)
//        {
//            Tax = Tax + 0.05f*(Salary-2.5f);
//            Tax = Tax + 0.2f*(Salary-5.0f);
//            Tax = Tax + 0.3f*(Salary-10.0f);
//        }
//        System.out.println("The Total Tax paid By the Employee is: "+Tax);

        //        Question 4:
        // using Inhance Switch case....

//        System.out.print("Enter Day Number: ");
//        int day = sc.nextInt();
//
//        switch (day)
//        {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Choose 1-7");
//        }

        // Ques 5 Leap Year or not

        System.out.print("Enter The Year: ");
        int Year = sc.nextInt();

        if((Year % 100 == 0 && Year % 400 == 0) || (Year%4 == 0 && Year%100 != 0))
        {
            System.out.println("Given Year is Leap Year");
        }
        else
        {
            System.out.println("Given Year is not Leap Year");
        }



        // Ques 6

//        System.out.print("Enter your Content: ");
//        String Website = sc.next();
//
//        if(Website.endsWith(".com"))
//        {
//            System.out.println("This Is Commercial Website");
//        }
//        else if(Website.endsWith(".org"))
//        {
//            System.out.println("This Is Organization Website");
//        }
//        else if(Website.endsWith(".in"))
//        {
//            System.out.println("This Is Indian Website");
//        }
    }
}
