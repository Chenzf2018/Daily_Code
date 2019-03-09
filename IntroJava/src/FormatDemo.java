/*
Listing 4.6 FormatDemo.java
 */

public class FormatDemo
{
    public static void main(String[] args)
    {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s", "Degrees",
                "Radians", "Sine", "Cosine", "Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("\n%-18d%-16.4f%-13.4f%-15.4f%-10.4f",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        //int degrees = 60;
        degrees = 60;
        //double radians = Math.toRadians(degrees);
        radians = Math.toRadians(degrees);
        System.out.printf("\n%-18d%-16.4f%-13.4f%-15.4f%-10.4f",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}