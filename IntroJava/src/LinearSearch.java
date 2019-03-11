/*
The Linear Search Approach
 */

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int result = linearSearch(list, -2);
        System.out.println("The index of -2 in the list is " + result);
    }

    public static int linearSearch(int[] list, int key)
    {
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] == key)
                return i;
        }

        return -1;
    }
}