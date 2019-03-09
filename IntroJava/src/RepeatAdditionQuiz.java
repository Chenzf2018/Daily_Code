/*
将两个随机值相加，输入结果，直到答对为止
 */

import java.util.Scanner;

public class RepeatAdditionQuiz
{
    public static void main(String[] args)
    {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.printf("%d + %d = ", number1, number2);

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        while (number1 + number2 != answer)
        {
            System.out.println("You are wrong, try again!");
            System.out.printf("%d + %d = ", number1, number2);
            answer = input.nextInt();
        }

        System.out.println("You are right!");
    }
}