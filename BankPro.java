package com.company;



import java.util.Scanner;

class Bank{
    private String nameofdep;
    private String address;
    private int accountNumber;
    private double balanceInAccount;

    public void InputInfo(String pName,String add,int accNo,double balAcc) {
        nameofdep = pName;
        address = add;
        accountNumber = accNo;
        balanceInAccount = balAcc;
    }
    public void DisplayInfo() {
        System.out.println("PersonName => "+nameofdep);
        System.out.println("Address => "+address);
        System.out.println("AccountNumber => "+accountNumber);
        System.out.println("Balance => "+balanceInAccount);
    }
    public void deposit(double  amt) {
        balanceInAccount = balanceInAccount+amt;
    }
    public void withdraw(double amt) {
        if(balanceInAccount > amt) {
            balanceInAccount = balanceInAccount-amt;
        }
        else {
            System.out.println("Insufficient Balanace");
        }
    }

    public void ChangeAdd(String add) {
        address = add;
    }

    public int getAccountNum() {
        return accountNumber;
    }
}

public class BankPro {
    public static void main(String []args) {
        int size,i,f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of New User: ");
        size  = sc.nextInt();

        Bank ob[] = new Bank[size];

        int accNo=1000;
        String pName;
        String add;
        double balAcc;

        for(i = 0 ; i< size ; i++) {
            ob[i] = new Bank(); // create object for each user

            System.out.print("Enter Depsoiter Name: ");
            pName = sc.next();
            System.out.print("Enter Address ");
            add=sc.next();
            System.out.print("Enter Amount ");
            balAcc=sc.nextDouble();
//            System.out.print("Enter Account Number: ");
            accNo=accNo+1;
            ob[i].InputInfo(pName, add, accNo ,balAcc);
        }

        for(;;) {
            System.out.println("1.Display information and Balance of User ");
            System.out.println("2.Deposit More Amount ");
            System.out.println("3.Withdraw Amount ");
            System.out.println("4.Change Address");
            System.out.println("5.For Exit");

            System.out.println("Enter Choice ");
            int ch=sc.nextInt();

            switch(ch) {
                case 1:
                    f  = 0;
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    for(i = 0 ; i<size ; i++) {
                        if(accNo == ob[i].getAccountNum()) {
                            ob[i].DisplayInfo();
                            f = 1;
                            break;
                        }
                    }

                    if(f == 0) {
                        System.out.println("Please Check! Invalid Account Number");
                    }
                    break;
                case 2:
                    f = 0;
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    for(i = 0 ; i < size  ; i++){
                        if(accNo == ob[i].getAccountNum()){
                            System.out.print("Enter Amount to be Deposit: ");
                            balAcc = sc.nextInt();
                            ob[i].deposit(balAcc);
                            f = 1;
                        }
                    }
                    if(f == 0){
                        System.out.println("Please Check! Invalid Account Number");
                    }
                    break;
                case 3:
                    f = 0;
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    for(i = 0 ; i < size ; i++){
                        if(accNo == ob[i].getAccountNum()){
                            System.out.print("Enter Amount to withdraw: ");
                            balAcc = sc.nextInt();
                            ob[i].withdraw(balAcc);
                            f = 1;
                        }
                    }
                    if(f == 0){
                        System.out.println("Please Check! Invalid Account Number");
                    }
                    break;
                case 4:
                    f = 0;
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    for(i = 0 ; i < size ; i++){
                        if(accNo == ob[i].getAccountNum()){
                            System.out.print("Enter address: ");
                            add = sc.next();
                            ob[i].ChangeAdd(add);
                            f = 1;
                        }
                    }
                    if(f == 0){
                        System.out.println("Please Check! Invalid Account Number");
                    }

                case 5:
                    break;
            }

        }

    }
}
