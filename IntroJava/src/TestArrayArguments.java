/*
TestArrayArguments
 */

public class TestArrayArguments
{
    public static void main(String[] args)
    {
        int x = 1;
        int[] y = new int[10];

        exchange(x, y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }

    public static void exchange(int number, int[] numbers)
    {
        number = 0;
        numbers[0] = 3;
    }
}