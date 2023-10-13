package com.company;

import java.util.Scanner;

public class LabQuesFindGivenPattern {
    static int findPattern(char []str){
        int last = str[0];
        int i = 1;
        int count = 0;

        while (i<str.length){
            if(last == '0' && str[i] == '1'){
                while(str[i] == '1'){
                    i++;
                }
                if(str[i] == '0'){
                    count++;
                }
            }
            last = str[i];
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.next();

        char []str1 = str.toCharArray();
        System.out.println("Number of pattern found: "+findPattern(str1));
    }
}
