/*
Listing 6.9 TestMethodOverloading.java
 */

public class TestMethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println("The maximum of 3 and 4: " + max(3, 4));
        System.out.println("The maximum of 3.0 and 4.1: " + max(3.0, 4.1));
        System.out.println("The maximum of 3.0, 4.1 and 5.1: " + max(3.0, 4.1, 5.1));
    }

    public static int max(int i, int j)
    {
        return (i > j) ? i : j;
    }

    public static double max(double i, double j)
    {
        return (i > j) ? i : j;
    }

    public static double max(double i, double j, double k)
    {
        return max(max(i, j), k);
    }
}