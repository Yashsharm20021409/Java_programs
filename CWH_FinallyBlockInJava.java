package com.company;

public class CWH_FinallyBlockInJava {
    public static int greet(){
        try{
            int a = 9;
            int b = 0;
            int c = a/b;
            return  c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up the Resources...End of this function");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Result after divide of two Number is: "+greet());

        int a = 9;
        int b = 3;

        while(true){
            try{
                System.out.println("Division: "+a/b);
            }catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally: "+b);
            }
            b--;
        }

        try{
            System.out.println("Div: "+5/0);
        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        finally {
            // after printing this line you will get error but not print which type because we not use catch here
            System.out.println("I am final block of this program");
        }
    }
}
