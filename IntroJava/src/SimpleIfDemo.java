/*
Listing 3.2 SimpleIfDemo.java
 */

import java.util.Scanner;

public class SimpleIfDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Hi even!");
        else
            System.out.println("Hi odd!");
    }
}