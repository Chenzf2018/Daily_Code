/*
Listing 9.8 Circle.java(for CircleWithPrivateDataFields)
The Circle class encapsulates circle properties and provides getter/setter and other methods.
 */

public class CirclePrivate
{
    private double radius = 1;
    private static int numberOfObjects = 0;

    public CirclePrivate()
    {
        numberOfObjects ++;
    }

    public CirclePrivate(double newRadius)
    {
        radius = newRadius;
        numberOfObjects ++;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double newRadius)
    {
        radius = (newRadius > 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }
}