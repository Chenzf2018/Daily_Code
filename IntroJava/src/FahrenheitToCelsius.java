/*
输入华氏度转摄氏度
 */

import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree for Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " celsius.");

        System.out.println("5 / 2 = " + 5 / 2);
        System.out.println("5.0 / 2 = " + 5.0 / 2);
    }
}
