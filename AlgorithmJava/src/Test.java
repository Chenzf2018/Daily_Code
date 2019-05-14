import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf("Is %s a palindrome string? %b", str, isPalindrome(str));
    }

    public static boolean isPalindrome(String str)
    {
        //if (str.length() == 1)
        if (str.length() <= 1)
            return true;
        else if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        else
            return isPalindrome(str.substring(1, str.length() - 1));
    }
}