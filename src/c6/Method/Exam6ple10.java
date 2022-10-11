package c6.Method;

public class Exam6ple10 {
    public static void main(String[] args) {
        System.out.println("the square of integer is " + square(7));
        System.out.println("the square of double is " + square(7.5));
    }
    public static int square(int value){
        System.out.println("the square is " + value);
        return value * value;
    }
    public static double square(double value){
        System.out.println("the double square " + value);
        return value * value;
    }
}
