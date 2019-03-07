/*
Listing 2.2 ComputeAreaWithConsoleInput.java
向控制台输入数据。并读出数据
 */

import java.util.Scanner;

public class ComputeAreaWithConsoleInput
{
    public static void main(String[] args)
    {
        //java.util.Scanner input = new java.util.Scanner(System.in);
        Scanner input = new Scanner(System.in);

        //double radius;
        //double area;

        System.out.print("Enter a number for radius: ");

        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;
        System.out.println("The area for circle of radius " + radius + " is " + area);
    }
}
