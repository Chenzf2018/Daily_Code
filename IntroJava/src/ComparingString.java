/*
==用于判断是否是同一个对象；equals方法用于判断内容是否相同
 */

public class ComparingString
{
    public static void main(String[] args)
    {
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        String s3 = "Java";
        String s4 = "Java";

        System.out.println(s3 == s4); //true
        System.out.println(s3.equals(s4)); //true

        if (s3 == s4)
            System.out.println("s1 and s2 are the same objects!");
        else
            System.out.println("s1 and s2 are not the same objects!");

        if (s3.equals(s4))
            System.out.println("s1 and s2 have the same contents!");
        else
            System.out.println("s1 and s2 don't have the same contents!");
    }
}