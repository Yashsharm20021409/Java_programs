package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_FileHandlingAssingment {
    public static void main(String[] args) {
        File myfile = new File("Assingment.txt");

        try{
            myfile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Get Error While Creating a File");
            e.printStackTrace();
        }

        String Table = "";
        int tab = 13;
        for(int i = 1 ; i<= 10 ; i++){
            Table += tab + " X " + (i) + " = " + i*tab;
            Table += "\n";
        }

        try{
            FileWriter myFile = new FileWriter("Assingment.txt");
            myFile.write(Table);

            myFile.close();
        }
        catch (IOException e){
            System.out.println("File Not Found In Directory");
            e.printStackTrace();
        }

        File myfile2 = new File("Assingment.txt");

        try{
            Scanner sc = new Scanner(myfile2);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            System.out.println(myfile2.getName()+" Read Successfully!!!");
            System.out.println(myfile2.getAbsolutePath());
            System.out.println(myfile2.getAbsoluteFile());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
