/*
Listing 11.7 CastingDemo.java
 */

public class CastingDemo
{
    public static void main(String[] args)
    {
        Object object1 = new CircleExtend(1);
        Object object2 = new Rectangle(1, 1);
        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object)
    {
        if (object instanceof CircleExtend)
        {
            System.out.println("The circle area is " + ((CircleExtend)object).getArea());
            System.out.println("The circle diameter is " + ((CircleExtend)object).getDiameter());
        }
        else if (object instanceof Rectangle)
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
    }
}