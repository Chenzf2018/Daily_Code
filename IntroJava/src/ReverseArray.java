/*
reverse an array
 */

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] list1 = {1, 2, 3};
        int[] list2 = reverse(list1);
        System.out.print("The origin array is ");
        for (int i: list1)
            System.out.print(i + " ");
       // System.out.println("\nThe reversed array is " + list2);  //[I@3b81a1bc
        System.out.println("\nThe reversed array is " + Arrays.toString(list2));
    }

    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];  // 先定义一个空的数组
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
            result[j] = list[i];

        return result;
    }
}