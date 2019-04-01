/*
Listing 12.4 QuotientWithException.java
 */

import java.util.Scanner;

public class QuotientWithException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try
        {
            int result = quotient(number1, number2);
            System.out.printf("The result of %d / %d is %d.", number1, number2, result);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Exception: an integer cannot be divided by zero.");
        }

        System.out.println("\nExecution continues...");
    }

    private static int quotient(int number1, int number2)
    {
        if (number2 == 0)
        {
            throw new ArithmeticException("Divisor cannot be zero.");
        }

        return number1 / number2;
    }
}