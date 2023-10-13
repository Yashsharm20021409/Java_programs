package com.company;

import java.util.Scanner;
//import java.util.Stri
class Library
{
    private String []AvailableBook = new String[5];
    private String []issuedBooks = new String[5];
    private int Count = 0;

    public void AvailableBooks()
    {
        System.out.println("Available Books are...");
        for(int i = 0 ; i< Count ; i++)
        {
            System.out.println(AvailableBook[i]);
        }
    }
    public boolean CheckBook(String NameofBook)
    {
        boolean flag = true;

        for(int i = 0 ; i < 5 ; i++)
        {
            if(AvailableBook[i] == NameofBook) {
                flag = true;
            }
        }
        return flag;
    }

    public void ManageBook(int i)
    {
        for(int j = i ; j<4 ; i++)
        {
            AvailableBook[j] = AvailableBook[j+1];
        }
        System.out.println("Successfully Removed!!!");
    }

    public void issueBook(String NameOfBook)
    {
        for(int i = 0 ; i<5 ; i++)
        {
            boolean flag = NameOfBook.equalsIgnoreCase(AvailableBook[i]);
            if(flag)
            {
                System.out.println("Book Number: "+i);
                System.out.println("Your Book: "+NameOfBook);
                System.out.println("Books Issued Successfully...");
                System.out.println("ThankYou! Visit Again");
                ManageBook(i);
            }
        }
    }

    public void addBook(String BookName)
    {
        if(Count < 5) {
            AvailableBook[Count] = BookName;
            Count++;
        }
        else {
            System.out.println("Library is Full...");
        }
    }
    public void returnBook()
    {

    }
}

public class OnlineLibraryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library obj = new Library();

        System.out.println("Add The Books Into the Library");
        for(int i = 0 ; i<5 ; i++)
        {
            String BookName;
            System.out.print("Enter the Name: ");
            BookName = sc.next();
            obj.addBook(BookName);
        }

        System.out.println("1.Show Books\n2.IssueBook\n3.ReturnBook\n4.ExitFromLib");
        int ch;

        while(true)
        {
            System.out.print("Enter Your Choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                     obj.AvailableBooks();
                     break;
                case 2:
                    String NameOfBook;
                    System.out.print("Enter Book Name: ");
                    NameOfBook = sc.next();

                    if(obj.CheckBook(NameOfBook))
                    {
                        System.out.println("Book found");
                        obj.issueBook(NameOfBook);
                    }
                    else
                    {
                        System.out.println("No Result Found");
                    }
                    break;
                case 4:
                    break;

            }
        }
    }
}
