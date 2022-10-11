package c7;

import java.util.Scanner;

public class PractiseExercise {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Enter the Items Number: ");
        int n = input.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int v = 0;v < arr.length;v++){
            arr[v] = input.nextDouble();
            sum += arr[v];
        }
        double average = sum / n;

        int count = 0;
        for (int v = 0;v < n;v++){
            if (arr[v] > average)
                count++;
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);




    }
}
