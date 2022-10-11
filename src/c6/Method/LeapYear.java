package c6.Method;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check LeapYear");
        int l = input.nextInt();


        System.out.println(isLeapYear(l));

    }
    public static boolean isLeapYear(int v) {
        if (((v % 4 == 0) && (v % 100 != 0)) || (v % 400 == 0)){
            return true;

        }
        return false;
    }
}
