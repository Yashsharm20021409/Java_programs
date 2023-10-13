package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

class Game
{
    public  int NoOfGuesses = 0;
  //  private int i = 0;
    private int RandomNumber;
    private int GuessNumber;

    public  int NumberOfGuess()
    {
        NoOfGuesses++;
        return NoOfGuesses;
    }
    public Game(int randomNumber)
    {
       RandomNumber = randomNumber;
    }
    public void Setter(int guessNumber)
    {
        GuessNumber = guessNumber;
    }
    public boolean Getter()
    {
        if(RandomNumber == GuessNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Guess_TheNumber_Game {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int RandomNumber = rn.nextInt(100);

        int GuessNumber;

        Game obj = new Game(RandomNumber);
        System.out.println("Guess Number: "+RandomNumber);

        System.out.print("Number of Times You Want to play Game: ");
        int n = sc.nextInt();
        int i;
        int chance = n;

        for (i = 0 ; i<n ; i++)
        {

            System.out.println("Guess No. "+(i+1));
            System.out.print("Guess Number: ");
            GuessNumber = sc.nextInt();
            obj.Setter(GuessNumber);

            if(obj.Getter())
            {
                System.out.println("Congregations Buddy!.You Guess The Correct Number... ");


                if(obj.NumberOfGuess() < 3)
                {
                    System.out.println("SCORE: ***");
                    break;
                }
                else if(obj.NumberOfGuess() == 3)
                {
                    System.out.println("SCORE: **");
                    break;
                }
                else
                {
                    System.out.println("SCORE: *");
                    break;
                }
            }
            else
            {
                System.out.println("Oops! You Guess Wrong Number...");
                obj.NumberOfGuess();

                if(GuessNumber > RandomNumber)
                {
                    System.out.println("You Guess Little Large Number (Try Again!)");
                    System.out.println("Chance Left: "+(--chance));
                    if(chance == 0)
                    {
                        System.out.println("GameOver...Try Again");
                    }
                }
                else
                {
                    System.out.println("You Guess Little Small Number (Try Again!)");
                    System.out.println("Chance Left: "+(--chance));
                    if(chance == 0)
                    {
                        System.out.println("GameOver...Try Again");
                    }
                }
            }
        }
    }
}
