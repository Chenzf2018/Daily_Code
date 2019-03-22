/*
Math.random()
java.util.Random
 */

import java.util.Random;

public class RandomClass
{
    public static void main(String[] args)
    {
        Random randomNum1 = new Random(3);
        System.out.println("1st:");
        for (int i = 0; i < 10; i++)
            System.out.print(randomNum1.nextInt(1000) + " ");

        Random randomNum2 = new Random(3);
        System.out.println("\n2nd:");
        for (int i = 0; i < 10; i++)
            System.out.print(randomNum2.nextInt(1000) + " ");

        Random randomNum3 = new Random(55);
        System.out.println("\n3rd:");
        for (int i = 0; i < 10; i++)
            System.out.print(randomNum3.nextInt(1000) + " ");

        Random randomNum4 = new Random();
        System.out.println("\n4th:");
        for (int i = 0; i < 10; i++)
            System.out.print(randomNum3.nextInt(1000) + " ");
    }
}