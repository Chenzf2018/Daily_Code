/*
Listing 5.9 GreatestCommonDivisor.java
输入两个整数，找出其最大公约数
 */

import java.util.Scanner;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first intger: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int commonDivisor = 1;
        for (int k = 2; k <= number1 && k <= number2; k++)
        {
            if (number1 % k == 0 && number2 % k == 0)
                commonDivisor = k;
        }
        System.out.printf("The Greatest Common Divisor of %d and %d is %d.",
                number1, number2, commonDivisor);
    }
}