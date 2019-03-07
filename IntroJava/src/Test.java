/*
1. Math.pow(a, b);
2. To denote an integer literal of the long type, append the letter L or l to it.
3. By default, a floating-point literal is treated as a double type value.
4. The double type values are more accurate than the float type values.
 */

public class Test
{
    public static void main(String[] args)
    {
        double a = Math.pow(2, 3);  // 返回值是double型
        long b = 4567_7891L;
        double c = 1.0D;
        float d = 2.0F;

        System.out.println("Math.pow(2, 3) is " + a);
        System.out.println("1.0 / 3.0 is "+ 1.0 / 3.0);
        System.out.println("1.0F / 3.0F is "+ 1.0F / 3.0F);
        System.out.println(2147483647 + 1);
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);
    }
}