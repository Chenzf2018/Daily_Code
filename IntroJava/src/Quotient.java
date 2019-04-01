/*
Listing 12.1 Quotient.java
 */

import java.util.Scanner;

public class Quotient
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.printf("The quotient of %d / %d is %d", number1, number2, number1 / number2);
    }
}