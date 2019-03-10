/*
Listing 5.11 Dec2Hex.java
 */

import java.util.Scanner;

public class Dec2Hex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hexString = "";

        while (decimal != 0)
        {
            int hexValue = decimal % 16;
            char hex = (0 <= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
            // numeric与char相加，是numeric与char对应的数值相加
            hexString = hex + hexString;

            decimal /= 16;
        }

        System.out.println("The hex number is " + hexString);
    }
}