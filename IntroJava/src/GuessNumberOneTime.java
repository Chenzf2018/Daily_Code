/*
Listing 5.2 GuessNumberOneTime.java
获得0-100随机数，输入一个数，并判断其偏大还是偏小
 */

import java.util.Scanner;

public class GuessNumberOneTime
{
    public static void main(String[] args)
    {
        int guessNumber = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (guessNumber == number)
            System.out.println("You are right!");
        else if (guessNumber < number)
            System.out.println("Your guess is high!");
        else
            System.out.println("Your guess is low!");
    }
}