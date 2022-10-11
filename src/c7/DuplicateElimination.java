package c7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] nums = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int counter = 0 ;
        boolean isFull = false;
        while (!isFull) {
            System.out.println("Enter number range 10 to 100: ");
            int num = input.nextInt();
            if (num >= 10 && num <= 100) {
                boolean isDuplicated = false;
                if (counter == 0) {
                    nums[counter] = num;
                    counter++;
                } else {
                    for (int v = 0; v < counter; v++) {
                        if (nums[v] == num) {
                            isDuplicated = true;
                            break;
                        }
                    }
                }
                if (isDuplicated) {
                    System.out.println("You've entered an existing number.Enter another number");
                    num = input.nextInt();
                } else {
                    nums[counter] = num;
                    counter++;
                }
            } else {
                System.out.println("You've entered an invalid number. Enter another number");
                num = input.nextInt();
            }
            if (counter == nums.length) {
                isFull = true;
            } else {
                System.out.println(num + " has been added. ");

            }
        }
        System.out.println(Arrays.toString(nums));



            }

        }






