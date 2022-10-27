package intro.c7;

public class StillOnArray {
    public static int myMethod(int x,int y){
        return x + y;
    }
    public static double myMethod(double x,double y){
        return x + y;
    }
    public static void main(String... args){
        int num1 = myMethod(1,2);
        double num2 = myMethod(1.1,2.2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
