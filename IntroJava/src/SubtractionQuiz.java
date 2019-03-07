/*
Listing 3.3 SubtractionQuiz.java
 */

import java.util.Scanner;

public class SubtractionQuiz
{
    public static void main(String[] args)
    {
        //System.out.print(Math.random() * 10); // 7.860644896636994

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number2 < number1)
        {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        Scanner input = new Scanner(System.in);
        System.out.print(number2 + " - " + number1 + " is ? ");
        int answer = input.nextInt();

        if (number2 - number1 == answer)
            System.out.println("You are right!");
        else
        {
            System.out.println("You are wrong!");
            System.out.println(number2 + " - " + number1 + " = " + (number2 - number1));
        }
    }
}