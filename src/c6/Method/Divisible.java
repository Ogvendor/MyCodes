package c6.Method;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int count = 0;
        for (int v = 1; v <= 10; v++) {
            count += 1;
            System.out.println(isDivisible(v));
            System.out.println(count);
    }
}

    public static boolean isDivisible(int num) {
        if (num % 5 == 0) {
            System.out.println("IsDivisble");
            return true;
        }else {
            System.out.println("Is Not Divisible");
            return false;
        }

    }
    }
