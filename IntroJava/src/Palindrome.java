/*
Listing 5.14 Palindrome.java
输入一个字符串，判断是否是回文
 */

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        /*
        int low = 0;
        int high = str.length() - 1;

        while (low < high)
        {
            if (str.charAt(low) == str.charAt(high))
            {
                low ++;
                high --;
            }
            else
            {
                System.out.println("The string is not palindrome.");
                break;
            }

        }

        System.out.println("The string is palindrome.");
        */

        boolean isPalindrome = true;  // 放在循环外面，防止string只有一个字符
        for (int low = 0, high = str.length() - 1; low < high; low ++, high --)
        {
            if (str.charAt(low) != str.charAt(high))
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }
}

