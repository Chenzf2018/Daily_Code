/*
Listing 12.9 ChainedExceptionDemo.java
 */

public class ChainedExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private static void method1() throws Exception
    {
        try
        {
            method2();
        }
        catch (Exception ex)
        {
            throw new Exception("New information from method1", ex);
        }
    }

    private static void method2() throws Exception
    {
        throw new Exception("New info from method2.");
    }
}