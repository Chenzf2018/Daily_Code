/*
Listing 7.3 TestPassArray.java
 */

public class TestPassArray
{
    public static void main(String[] args)
    {
        int[] a = {1, 2};

        System.out.println("Before invoking swap: ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}." );
        swap(a[0], a[1]);
        System.out.println("\nAfter invoking swap: ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}." );

        System.out.println("\nBefore invoking swapFirstTwoInArray: ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}." );
        swapFirstTwoInArray(a);
        System.out.println("\nAfter invoking swapFirstTwoInArray: ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}." );
    }

    public static void swap(int i, int j)
    {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void swapFirstTwoInArray(int[] array)
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}