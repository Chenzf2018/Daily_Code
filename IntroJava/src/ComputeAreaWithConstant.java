/*
Listing 2.4 ComputeAreaWithConstant.java
By convention, all letters in a constant are in uppercase.
 */

import java.util.Scanner;

public class ComputeAreaWithConstant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        final double PI = 3.14159;

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius +
                " is " + area);
    }
}