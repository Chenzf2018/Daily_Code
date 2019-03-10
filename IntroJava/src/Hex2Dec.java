/*
Listing 6.8 Hex2Dec.java
任意位十六进制
 */

import java.util.Scanner;

public class Hex2Dec
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.printf("The decimal value of %s is %d", hex, hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex)
    {
        int decimalValue = 0;  // 防止无法进入for循环
        for (int i = 0; i < hex.length(); i ++)
        {
            char hexChar = hex.charAt(i);  // hexChar是'1'....'F'
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch)
    {
        return (ch >= 'A' && ch <= 'F') ? (10 + ch - 'A') : (ch - '0');
    }
}