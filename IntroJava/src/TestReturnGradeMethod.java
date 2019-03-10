/*
Listing 6.3 TestReturnGradeMethod.java
 */

import java.util.Scanner;

public class TestReturnGradeMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your score: ");
        double score = input.nextDouble();
        System.out.printf("Your grade is %c", getGrade(score));
    }

    public static char getGrade(double score)
    {
        if (score > 90)
            return 'A';
        else
            return 'B';
    }
}