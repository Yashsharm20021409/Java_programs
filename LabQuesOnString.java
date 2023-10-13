package com.company;

public class LabQuesOnString {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello world My Self Yash sharma");
        String string = "Hel08 g98#";
        int ln = str.length();
//        System.out.println(ln);
        char c,ch =0;

        for(int i = 0 ; i <ln ; i++){
            c = 0;
            ch = str.charAt(i);
            ch = Character.toUpperCase(ch);

            switch(ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    c++;
                    break;
            }

            if(c>0){
                str.deleteCharAt(i);
                ln--;
            }
        }
        System.out.println(str);
        string = string.replaceAll("[^0-9]"," "); // replace all except 0-9
        String str2 = "This#is(Yash)Sharma%Persuing@btech*From Geu";
        str2 = str2.replaceAll("[a-zA-Z]"," ");  // replace all a-zA-Z ^not used here
        System.out.println(string);
        System.out.println(str2);
    }
}
