package com.company;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class wordExample1{
    private String str1="",st="",s="";
    int count =0,l;
    private String str;

    wordExample1(String str1){
        StringBuffer stringBuff = new StringBuffer(str1.toUpperCase());
        if(stringBuff.substring(stringBuff.length()-1).equals(".") || stringBuff.substring(stringBuff.length()-1).equals("?") || stringBuff.substring(stringBuff.length()-1).equals("!")){
            this.str1 = stringBuff.toString();
        }
    }

    void countWord(){
        int l = str.length();
        str = str.substring(0,l-1);
        String arr[] = str.split(" ");

        int count = 0;

        for(int  i = 0 ; i < arr.length-1 ; i++){
            st = arr[i];
            if(isVowel(st.charAt(0)) == true && isVowel(st.charAt(arr.length-1)) == true){
                count++;
            }
        }
        System.out.println("Number of Words: "+count);
    }

    boolean isVowel(char ch){
        if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
            return true;
        }
        return  false;
    }
}

public class WordExample {
    public static void main(String[] args) {
        String str1 ="HELLO GUYS HOW ARE YOU ALL";
        StringBuffer st = new StringBuffer("HELLO GUYS HOW ARE YOU ALL ?");

        wordExample1 ob = new wordExample1(str1);
    }
}
