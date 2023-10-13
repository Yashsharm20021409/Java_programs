package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperSizzerGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int i = 1;
        int YouWon = 0;
        int CompWon = 0;
        int YourChoice;
        int CompChoice;

        System.out.print("Number Of Times You Want To Play: ");
        int n = sc.nextInt();

        System.out.println("\nChose Between 0-2");
        System.out.println("0.For Rock\n1.For Sizzer \n2.For Paper\n");

        while (i<=n)
        {
            System.out.println("Chance: "+i);
            System.out.print("Your Choice: ");
            YourChoice = sc.nextInt();
            System.out.print("Computer Choice: ");
            CompChoice = rn.nextInt(3);  // means chose rand number from 0 to 3 only
            System.out.println(CompChoice);

            switch (CompChoice)
            {
                case 0:
                    switch (YourChoice)
                    {
                        case 0:
                            System.out.println("Match Tied!!");
                            break;
                        case 1:
                            System.out.println("You Lost!!");
                            CompWon++;
                            break;
                        case 2:
                            System.out.println("You Won!!!");
                            YouWon++;
                            break;
                        default:
                            System.out.println("Please Enter Valid Number...");
                            i--;
                    }
                    break;
                case 1:
                    switch (YourChoice)
                    {
                        case 0:
                            System.out.println("You Won!!");
                            YouWon++;
                            break;
                        case 1:
                            System.out.println("Match Tied!!");
                            break;
                        case 2:
                            System.out.println("You Lost!!!");
                            CompWon++;
                            break;
                        default:
                            System.out.println("Please Enter Valid Number...");
                            i--;
                    }
                    break;
                case 2:
                    switch (YourChoice)
                    {
                        case 0:
                            System.out.println("You Lost!!");
                            CompWon++;
                            break;
                        case 1:
                            System.out.println("You Won!!");
                            YouWon++;
                            break;
                        case 2:
                            System.out.println("Match Tied!!!");
                            break;
                        default:
                            System.out.println("Please Enter Valid Number...");
                            i--;
                    }
                    break;
            }
            i++;
            System.out.println("\n\n");
        }

        if(YouWon == CompWon)
        {
            System.out.println("This Game is Tied!!!Try Next Time");
        }
        else if(YouWon>CompWon)
        {
            System.out.println("You Won This Game "+YouWon);
            System.out.println("You won "+YouWon+"Games out of N games");
        }
        else
        {
            System.out.println("Computer Won This Game "+CompWon);
            System.out.println("Computer won "+CompWon+"Games out of N games");
        }
    }
}
