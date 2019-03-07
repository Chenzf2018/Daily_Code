/*
Listing 2.3 ComputeAverage.java
输入三个double类数并读取，最后算出平均值
注意输入数据的方式：在一行内输入，用空格符隔开；多行输入，用回车隔开
 */

import java.util.Scanner;

public class ComputeAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " " + number2 +
                " " + number3 + " is " + average);
    }
}
