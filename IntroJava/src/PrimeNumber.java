/*
Listing 5.15 PrimeNumber.java
This section presents a program that displays the first 50 prime numbers in 5 lines,
each containing 10 numbers.
 */

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_PRIME = 50;
        int count = 0; // number of prime
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int number = 2;  // number to be tested for prime

        while (count < NUMBER_OF_PRIME)
        {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++)
            {
                if (number % divisor == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                count ++;

                if (count % NUMBER_OF_PRIME_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }

            number ++;
        }
    }
}