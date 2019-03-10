/*
Listing 5.10 FutureTuition.java
Suppose the tuition for a university is $10,000 this year and tuition increases 7% every year.
In how many years will the tuition be doubled?
 */

public class FutureTuition
{
    public static void main(String[] args)
    {
        double currentTuition = 10000;
        int year = 0;
        while (currentTuition <= 20000)
        {
            currentTuition *= 1.07;
            year ++;
        }
        System.out.printf("%d years latter, the tuition is doubled to be $%.2f", year, currentTuition);
    }
}