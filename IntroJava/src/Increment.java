/*
Listing 6.4 Increment.java
将实参按值传给形参，改变形参的值，看实参是否改变
 */

public class Increment
{
    /*
    public static void main(String[] args)
    {
        int x = 1;
        System.out.printf("Before the call, x is %d\n", x);
        increment(x);
        System.out.printf("After the call, x is %d\n", x);
    }

    public static void increment(int x)
    // 形参可以和实参名字相同，这样更能体现按值传递的含义
    {
        x ++;
        System.out.printf("x inside the method is %d\n", x);
    }
    */

    public static void main(String[] args)
    {
        int x = 1;
        System.out.printf("Before the call, x is %d\n", x);
        System.out.printf("After the call, x is %d\n", increment(x));
    }

    public static int increment(int n)
    {
        n ++;
        System.out.printf("x inside the method is %d\n", n);
        return n;
    }
}

