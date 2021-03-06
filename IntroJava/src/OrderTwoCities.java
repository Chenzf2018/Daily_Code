/*
Listing 4.2 OrderTwoCities.java
输入两个城市，并按字母顺序排序
compareTo(s) returns an integer
 */

import java.util.Scanner;

public class OrderTwoCities
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        //if (city1.compareTo(city2))
        if (city1.compareTo(city2) < 0)
            System.out.println("The city in alphabetical order is " + city1 + " " + city2);
        else
            System.out.println("The city in alphabetical order is " + city2 + " " + city1);
    }
}