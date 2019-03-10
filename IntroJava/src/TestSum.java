/*
Listing 5.8 TestSum.java
Minimizing numeric error
Add 0.01 0.02 ... 0.99 1.0 to sum
 */

public class TestSum
{
    public static void main(String[] args)
    {
        /*
        float sum = 0;
        for (float i = 0.01f; i <= 1.0f; i += 0.01f)
            sum += i;
        System.out.println("Sum is " + sum); // 49.50000000000003
        */

        /*
        double sum = 0;
        for (double i = 0.01; i <= 1.0; i += 0.01)
        {
            sum += i;
            System.out.println(i);  // 0.9900000000000007
        }
        System.out.println(sum); // 49.50000000000003
        */

        /*
        double addValue = 0.01;
        double sum = 0;
        for (int count = 0; count < 100; count++)
        {
            sum += addValue;
            addValue += 0.01;
        }
        System.out.println(sum);  // 50.50000000000003
        */

        double currentValue = 1.0;
        double sum = 0;
        for (int count = 0; count < 100; count++)
        {
            sum += currentValue;
            currentValue -= 0.01;
        }
        System.out.println(sum); //50.49999999999995
    }
}