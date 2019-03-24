/*
Listing 9.10 TestPassObject.java
 */

public class TestPassObject
{
    public static void main(String[] args)
    {
        CirclePrivate myCircle = new CirclePrivate(1);
        // print area for radius 1 2 3 4 5
        int n = 5;
        printArea(myCircle, n);

        System.out.println("\nRadius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printArea(CirclePrivate circle, int times)
    {
        System.out.println("Radius \t\tArea");
        while (times > 1)
        {
            System.out.println(circle.getRadius() + "\t\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            times --;
        }
    }
}