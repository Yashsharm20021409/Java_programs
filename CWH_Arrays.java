package com.company;
import java.util.Locale;
import java.util.Scanner;

public class CWH_Arrays {
    public static void main(String[] args) {
        int []Marks = new int[5];
        float []Marks2 = new float[5];
        String []Name = new String[5];

        Scanner sc = new Scanner(System.in);

        // for integer Array
//        for (int i = 0 ; i<Marks.length ; i++)
//        {
//            System.out.print("Enter the Marks: ");
//            Marks[i] = sc.nextInt();
//        }

        // for Float Array
//        for (int i = 0 ; i<Marks2.length ; i++)
//        {
//            System.out.print("Enter the Marks: ");
//            Marks2[i] = sc.nextFloat();
//        }

        // for String Array
        for (int i = 0 ; i<Name.length ; i++)
        {
            System.out.print("Enter the Name: ");
//            Name[i] = sc.next();
            Name[i] = sc.nextLine();
        }

        System.out.println(Name[2]);
        System.out.println("Length Of Given Array: "+Name.length);

        // Displaying array using for and For Each loop

        for (int i = 0 ; i<Name.length ; i++)
        {
            System.out.printf("Array Element[%s]: %s\n",i,Name[i]);
        }

        // Using For-Each Loop

        for (String Element: Name)
        {
            System.out.println("Name: "+Element);
        }

    }
}
