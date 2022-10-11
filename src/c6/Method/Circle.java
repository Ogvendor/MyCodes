package c6.Method;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double num = input.nextInt();

        System.out.println(circleArea(num));
    }
    public static double circleArea( double num) {
        double Area = Math.PI * num * num  ;
        System.out.println("Answer:" + Area);
        return Area;
    }
}
