/*
Listing 7.7 BinarySearch.java
 */

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};  // 必须是已排列数据
        int index = binarySearch(list, 3);
        System.out.println("The index of 3 in list is " + index);
    }

    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (list[mid] > key)
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}