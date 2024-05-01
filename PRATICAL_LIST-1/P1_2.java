// Pr - 2 Write a Java program that declares two double variables (radius, area) and compute the area of a circle.

import java.util.Scanner;

public class P1_2 
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+area);
    }       
}
