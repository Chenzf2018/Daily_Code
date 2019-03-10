/*
Listing 6.7 PrimeNumberMethod.java
This section presents a program that displays the first 50 prime numbers in 5 lines,
each containing 10 numbers.
 */

public class PrimeNumberMethod
{
    public static void main(String[] args)
    {
        System.out.println("The first 50 prime number are ");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes)
    {
        int count = 0;  // count the prime number
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int number = 2;  // number to be tested

        while (count < numberOfPrimes)
        {
            if (isPrime(number))
            {
                count ++;  // 当前质数的个数

                if (count % NUMBER_OF_PRIME_PER_LINE == 0)
                    System.out.printf("%-6d\n", number);
                else
                    System.out.printf("%-6d", number);
            }

            number ++;
        }
    }

    public static boolean isPrime(int number)
    {
        for (int divisor = 2; divisor <= number / 2; divisor ++)
        {
            if (number % divisor == 0)
                return false;
        }

        return true;
    }
}
