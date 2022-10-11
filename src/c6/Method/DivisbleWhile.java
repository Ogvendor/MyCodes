package c6.Method;

public class DivisbleWhile {
    public static void main(String... args) {
        int v = 1;
        int count = 1;
        while (v <=10){
            System.out.println(isDivisible(v));
            System.out.println(count);
            v++;
            count++;

        }
    }

    public static boolean isDivisible(int num){
        if (num % 5 == 0) {
            System.out.println("Is Divisible");
            return true;
        }else{
            System.out.println("Is not Divisible");
            return false;
        }
    }
}
