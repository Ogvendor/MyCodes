package c5.GlobalWarming;

import java.util.Scanner;

public class GlobalWarmingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ansCount = 0;
        int v = 0;

        String options = "1 Yes   2 No   3 Never  4 Maybe";
        String question1 = "Do you like Love";
        String question2 = "Do you want to meet love soon";
        String question3 = "Would you rate her above 100%";
        String question4 = "Do you like victor?";
        String question5 = "Do you like Love";

        do{
            switch (v) {
                case 0 -> {
                    System.out.println((question1));
                    System.out.println((options));
                }
                case 1 -> {
                    System.out.println((question2));
                    System.out.println((options));
                }
                case 2 -> {
                    System.out.println((question3));
                    System.out.println((options));
                }
                case 3 -> {
                    System.out.println((question4));
                    System.out.println((options));
                }
                case 4 -> {
                    System.out.println((question5));
                    System.out.println((options));
                }
            }
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

