/*
Listing 6.1 TestMax.java
比较两个值的大小
 */

public class TestMax
{
    public static void main(String[] args)
    {
        int i = 5;
        int j = 9;
        int k = max(i, j);
        System.out.printf("The maxium of %d and %d is %d.", i, j, k);
    }

    public static int max(int a, int b)
    {
        /*
        if (a < b)
            return b;
        else
            return a;
         */
        int result;
        if (a < b)
            result = b;
        else
            result = a;
        return result;
    }
}

