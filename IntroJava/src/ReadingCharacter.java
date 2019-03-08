/*
To read a character from the console, use the nextLine() method to read a string and then
invoke the charAt(0) method on the string to return a character.
 */

import java.util.Scanner;

public class ReadingCharacter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}