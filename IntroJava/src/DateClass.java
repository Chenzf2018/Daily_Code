/*
Date()
getTime()
toString()
 */

import java.util.Date;

public class DateClass
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " milliseconds.");
        System.out.println(date.toString());
    }
}