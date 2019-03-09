/*
Listing 4.5 LotteryUsingStrings.java
利用字符串拼接得到两位随机数
 */

import java.util.Scanner;

public class LotteryUsingStrings
{
    public static void main(String[] args)
    {
        String lotteryNumber = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        char lotteryDigit1 = lotteryNumber.charAt(0);
        char lotteryDigit2 = lotteryNumber.charAt(1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guessNumber = input.nextLine();
        char guessDigit1 = guessNumber.charAt(0);
        char guessDigit2 = guessNumber.charAt(1);

        System.out.println("The lottery number is " + lotteryNumber);

        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("Match all digits: you win $3,000");
        else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit1
                || lotteryDigit2 == guessDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match!");
    }
}
