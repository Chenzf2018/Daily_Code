/*
Listing 3.8 Lottery.java
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
If a number is less than 10, we assume that the number is preceded by a 0 to form a two-digit number.
For example, number 8 is treated as 08, and number 0 is treated as 00 in the program.
 */

import java.util.Scanner;

public class Lottery
{
    public static void main(String[] args)
    {
        int lotteryNumber = (int) (Math.random() * 100);
        int lotteryDigit1 = lotteryNumber / 10;
        int lotteryDigit2 = lotteryNumber % 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess number (two digits): ");
        int guessNumber = input.nextInt();
        int guessDigit1 = guessNumber / 10;
        int guessDigit2 = guessNumber % 10;

        System.out.println("The lottery number is " + lotteryNumber);

        if (guessNumber == lotteryNumber)
            System.out.println("Exact match: the award is $10,000");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("Math all digits: the award is $3,000");
        else if (lotteryDigit1 == guessDigit1
                    || lotteryDigit1 == guessDigit2
                    || lotteryDigit2 == guessDigit1
                    || lotteryDigit2 == guessDigit2)
            System.out.println("Match one digit: the award is $1,000");
        else
            System.out.println("Sorry, no match!");
    }
}