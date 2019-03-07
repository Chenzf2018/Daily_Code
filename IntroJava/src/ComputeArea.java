/*
Listing 2.1 ComputeArea.java
计算圆的面积
 */

public class ComputeArea
{
    public static void main(String[] args)
    {
        double radius = 20 ;
        double area;

        area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius +
                " is " + area);
    }
}
