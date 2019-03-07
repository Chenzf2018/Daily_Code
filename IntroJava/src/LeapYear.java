/*
Listing 3.7 LeapYear.java
输入一个年份，判断是否为闰年
 */

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        /*
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println();
        */

        boolean isLeapYear =
                (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        System.out.println(year + " is a leap year ? " + isLeapYear);
    }
}