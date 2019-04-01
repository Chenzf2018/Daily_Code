/*
Listing 12.7 CircleWithException.java
 */

public class CircleWithException
{
    private double radius;
    private static int numberOfObject = 0;

    // Construct a circle with radius 1
    public CircleWithException()
    {
        this(1.0);
    }

    /** Construct a circle with a specified radius*/
    public CircleWithException(double newRadius)
    {
        setRadius(newRadius);
        numberOfObject ++;
    }

    public double getRadius()
    {
        return radius;
    }

    /*
    public void setRadius(double newRadius)
    {
        throw IllegalArgumentException  // Declare exception
        {
            if (newRadius >= 0)
                radius = newRadius;
            else
                throw new IllegalAccessException("Radius cannot be negative.");  // throw exception
        }
    }
    */

    public void setRadius(double newRadius) throws IllegalArgumentException  // declare exception
    {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative.");  // throw exception
    }

    public static int getNumberOfObject()
    {
        return numberOfObject;
    }

    public double findArea()
    {
        return radius * radius * Math.PI;
    }
}