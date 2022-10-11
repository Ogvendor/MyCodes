package intro.c3;

import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args){
      int number1 = (int)(Math.random()*10);
      int number2 = (int)(Math.random()*10);

      if(number1 < number2){
          int temp = number1;

          number1 = number2;
          number2 = temp;
      }
      //Prompt the student to answer "What is number1 - number2?";
        System.out.print("What is "+  number1 + "-" + number2 + "?");
      Scanner input = new Scanner(System.in);
      int answer = input.nextInt();

      //Grade the answer and display the result
        if(number1 - number2 == answer)
            System.out.println("You are correct!");
        else{
            System.out.println("Your answer is wrong");
            System.out.println(number1 + "-" + number2 +
                    "Should be " + (number1 - number2));
        }

    }
}
