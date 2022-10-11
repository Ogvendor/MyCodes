package c5.GlobalWarming;

import java.util.Scanner;

public class GlobalWarmingDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ansCount = 0;
        int v = 0;

        do{

            System.out.println("Question1 : Do you like Love");
            System.out.println("1 : Yes ");
            System.out.println("2 : No");
            System.out.println("3 : God forbid");
            System.out.println("4 : Leave me");

            System.out.println("What is your ans: ");
            int ans = input.nextInt();
            if(ans == 1){
                ansCount++;
            }
            v++;

        }
        while(v < 5);
        if (ansCount == 5) {
            System.out.println("Excellent");
        }
            if (ansCount == 4){
                System.out.println("Very Good");
            }
            if (ansCount <= 3){
                System.out.println("Time to brush up on your knowledge of global warming");
            }
    }

}
