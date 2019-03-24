/*
Listing 11.2 Circle.java
 */

public class CircleExtend extends GeometricObject
{
    private double radius;

    public CircleExtend()
    {

    }

    public CircleExtend(double radius)
    {
        this.radius = radius;
    }

    public CircleExtend(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}