/*
Listing 5.5 SentinelValue.java
输入整数进行求和，当遇到数字0时，停止程序
 */

import java.util.Scanner;

public class SentinelValue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0)
        {
            sum += data;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}