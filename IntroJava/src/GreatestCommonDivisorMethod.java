/*
Listing 6.6 GreatestCommonDivisorMethod.java
 */

import java.util.Scanner;

public class GreatestCommonDivisorMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.printf("The greatest common divisor of %d and %d is %d",
                number1, number2, gcd(number1, number2));
    }

    public static int gcd(int i, int j)
    {
        int commonDivisor = 1;
        for (int k = 2; k <= i && k <= j; k ++)
        {
            if (i % k == 0 && j % k == 0)
                commonDivisor = k;
        }
        return commonDivisor;
    }
}