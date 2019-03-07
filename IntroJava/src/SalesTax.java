/*
Listing 2.8 SalesTax.java
购买金额*税率=交税金额
 */

import java.util.Scanner;

public class SalesTax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double salesTax = purchaseAmount * 0.06;

        System.out.println("1.Sales tax is " + salesTax);
        System.out.println("2. Sales tax is " + salesTax * 100 / 100.0);
        System.out.println("3. Sales tax is " + (int) (salesTax * 100) / 100.0);
        System.out.println("4. Sales tax is " + (int) (salesTax * 100 + 0.5) / 100.0);
    }
}