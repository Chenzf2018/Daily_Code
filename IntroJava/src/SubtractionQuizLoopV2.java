/*
Listing 5.4 SubtractionQuizLoop.java
实现最终输出所有答题结果：利用字符串！
 */

import java.util.Scanner;

public class SubtractionQuizLoopV2
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0; // count the number of question
        int numberOfCorrectAnswers = 0;
        String output = "";

        Scanner input = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS)
        {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2)
            {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.printf("%d - %d = ", number1, number2);
            int answer = input.nextInt();

            if (number1 - number2 == answer)
            {
                System.out.println("You are right!\n");
                numberOfCorrectAnswers ++;
            }
            else
                System.out.printf("You are wrong!\n" +
                        "%d - %d = %d\n\n", number1, number2, number1 - number2);

            count ++;
            output += "\n" + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == answer) ? "\tCorrect": "\tWrong");
        }

        long endTime = System.currentTimeMillis();
        long timeSpent = (endTime - startTime) / 1000;
        System.out.printf("Test time: %d minute(s) %d second(s).", timeSpent / 60, timeSpent % 60);

        System.out.println("\nCorrect count: " + count);
        System.out.println(output);
    }
}