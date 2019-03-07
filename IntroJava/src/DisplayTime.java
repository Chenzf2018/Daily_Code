/*
Listing 2.5 DisplayTime.java
输入总的秒时间，转化成分钟：秒形式；
 */

import java.util.Scanner;

public class DisplayTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}