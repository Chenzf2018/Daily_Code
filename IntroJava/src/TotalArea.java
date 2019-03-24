/*
Listing 9.11 TotalArea.java
The program creates circleArray, an array composed of five Circle objects;
it then initializes circle radii with random values and
displays the total area of the circles in the array.
 */

public class TotalArea
{
    public static void main(String[] args)
    {
        CirclePrivate[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static CirclePrivate[] createCircleArray()
    {
        CirclePrivate[] circleArray = new CirclePrivate[5];
        for (int i = 0; i < circleArray.length; i++)
            circleArray[i] = new CirclePrivate(Math.random() * 100);
        return circleArray;
    }

    public static void printCircleArray(CirclePrivate[] circleArray)
    {
        System.out.printf("%-34s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++)
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());

        System.out.printf("%-30s%-15f", "The total area of circles is", sum(circleArray));
    }

    public static double sum(CirclePrivate[] circleArray)
    {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();
        return sum;
    }
}
