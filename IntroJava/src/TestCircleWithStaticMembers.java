public class TestCircleWithStaticMembers
{
    public static void main(String[] args)
    {
        System.out.println("Before creating objects:");
        System.out.println("The number of Circle objects is " +
                CircleWithStaticMembers.numberOfObjects + "."); // static variable

        CircleWithStaticMembers circle1 = new CircleWithStaticMembers();
        System.out.println("\nAfter creating circle:");
        System.out.println("circle1: " + circle1.radius + // instance variable
                ". The number of Circle objects is " + circle1.numberOfObjects); // static variable

        CircleWithStaticMembers circle2 = new CircleWithStaticMembers(5);

        circle1.radius = 9;  // radius 非static，不共享。

        System.out.println("\nAfter creating circle2 and modifying circle1:");
        System.out.println("circle1: " + circle1.radius + ". The number of Circle objects is "
                + circle1.numberOfObjects);
        System.out.println("circle1: " + circle2.radius + ". The number of Circle objects is "
                + circle2.numberOfObjects);
    }
}
