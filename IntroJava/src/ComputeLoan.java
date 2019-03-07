/*
等额本息还款法
输出每月还款金额；总还款额
结果保留两位小数
 */

import java.util.Scanner;

public class ComputeLoan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        int loanAmount = input.nextInt();

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        double totalPayment = monthlyPayment * 12 * numberOfYears;

        System.out.println("The monthly payment: " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment: " + (int) (totalPayment * 100) / 100.0);

    }
}