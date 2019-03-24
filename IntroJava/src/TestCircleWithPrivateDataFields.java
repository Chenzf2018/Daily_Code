/*
Listing 9.9 TestCircleWithPrivateDataFields.java
 */
public class TestCircleWithPrivateDataFields
{
    public static void main(String[] args)
    {
        CirclePrivate myCircle = new CirclePrivate(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("\nThe area of the circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());

        System.out.println("\nThe number of objects created is " + CirclePrivate.getNumberOfObjects());
    }
}
