/*
Listing 5.3 GuessNumber.java
 */

import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);

        int guessNumber = -1;
        while (guessNumber != randomNumber)
        {
            System.out.print("Enter your guess number: ");
            guessNumber = input.nextInt();

            if (guessNumber == randomNumber)
                System.out.println("You are right!");
            else if (guessNumber < randomNumber)
                System.out.println("Your guess is low!\n");
            else
                System.out.println("Your guess is high!\n");
        }


    }
}