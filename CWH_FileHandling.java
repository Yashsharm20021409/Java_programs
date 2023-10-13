package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_FileHandling {
    public static void main(String[] args) {

//      code to create a new file

//        File myFile = new File("CWH_FileHandling.txt");
//        try{
//            myFile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Enable to create this File");
//            e.printStackTrace();
//        }


//       code to write in a file


        try {
            String data = "Hi this is Yash ";
            FileWriter fileWriter = new FileWriter("CWH_FileHandling.txt");
            fileWriter.write("This is Our First File From Java Course");
//            fileWriter.write(ch);
//            output.write(data);
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("File Not Found");
            e.printStackTrace();
        }


//        Reading A file
        File myfile = new File("CWH_FileHandling.txt");
        try{
            Scanner sc = new Scanner(myfile);
            int count = 0;
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
//                System.out.println(Line);
                for(int i = 0 ; i<Line.length() ; i++){
                    if(Line.charAt(i) == 'A' || Line.charAt(i) == 'E' || Line.charAt(i) == 'I' || Line.charAt(i) == 'O' ||Line.charAt(i) == 'U'){
                        count++;
                    }
                    if(Line.charAt(i) == 'a' || Line.charAt(i) == 'e' || Line.charAt(i) == 'i' || Line.charAt(i) == 'o' ||Line.charAt(i) == 'u'){
                        count++;
                    }
                }
            }
            System.out.println("Number of Vowels: "+count);
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }



//        Delete A file
//        File myFile = new File("CWH_FileHandling.txt");
//        if(myFile.delete()){
//            System.out.println("I have Deleted "+myFile.getName());
//        }
//        else{
//            System.out.println("Error Occurred While Deleting the file");
//        }
    }
}
