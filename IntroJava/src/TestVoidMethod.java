/*
Listing 6.2 TestVoidMethod.java
输入成绩，返回等级；调用不返回参数的方法
 */

import java.util.Scanner;

public class TestVoidMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your score: ");
        double score = input.nextDouble();
        System.out.print("Your grade is ");
        printGrade(score);
    }

    public static void printGrade(double score)
    {
        if (score > 90)
            System.out.println("A");
        else
            System.out.println("B");
    }
}