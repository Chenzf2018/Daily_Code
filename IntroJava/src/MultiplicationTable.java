/*
Listing 5.7 MultiplicationTable.java
输出乘法表
 */

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.println("MultiplicationTable");
        //System.out.println("      1   2   3");
        System.out.print("        ");
        for (int i = 1; i < 10; i++)
            System.out.print(i + "      ");
        System.out.println("\n======================================");

        for (int i = 1; i < 10; i++)
        {
            System.out.print(i + "  |");
            for (int j = 1; j < 10; j++)
            {
                //System.out.printf(i + "  |" + "%4d", i * j);
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }

    }
}