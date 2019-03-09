/*
Listing 5.4 SubtractionQuizLoop.java
Generates five questions and, after a student answers all five,
reports the number of correct answers. The program also displays the time spent on the
test and lists all the questions.

final int NUMBER_OF_FIVE_QUESTIONS = 5
count: 0-4
int numberOfCorrectAnswers
double startTime = System.currentTimeMillis();
 */

import java.util.Scanner;

public class SubtractionQuizLoop
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_FIVE_QUESTIONS = 5;
        int count = 0;
        int numberOfCorrectAnswers = 0;
        double startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_FIVE_QUESTIONS)
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
            {
                System.out.print("You are wrong!\n");
                System.out.printf("%d - %d = %d\n\n", number1, number2, number1 - number2);
            }

            count ++;
        }

        double endTime = System.currentTimeMillis();
        double timeSpent = (endTime - startTime) / 1000;
        System.out.printf("Test time is %d mintue(s) and %d second(s).\n",
                (int) (timeSpent / 60), (int) (timeSpent % 60));

        System.out.printf("Correct count is %d", numberOfCorrectAnswers);
    }
}