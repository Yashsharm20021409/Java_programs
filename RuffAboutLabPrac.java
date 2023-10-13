package com.company;

public class RuffAboutLabPrac {
    public static void main(String[] args) {
        String str = "Hello Guys";

        System.out.println("Is string immutable: "+str.toUpperCase());
        System.out.println(str); //  not chnage
        System.out.println(str.trim());
        System.out.println(str.substring(2 , 7));  // 7 not include

        int ch = 4;

        switch(ch){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
        }
    }
}
