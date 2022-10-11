package c7;

import java.util.Scanner;

public class AirlineReservation {
     private static boolean[] seats = new boolean[10];
     private static Scanner input = new Scanner(System.in);


     public static void main(String[] args) {
          boolean a = true;
          int x = 0;
          while (a){

               String info = """ 
                    Please press 1 for first class
                    Please press 2 for economy
                  """;
               System.out.println(info);
               int resp = input.nextInt();
               if (resp == 1) {
                    firstClass(x);
                    x++;
               }
               if (resp == 2) {
                    x = 5;
                    economy(x);
                    x++;
               }
          }

     }

     public static void firstClass(int x) {
          if (x < 5){
               seats[x] = true;
          }
          String info3 = """
                       Your Boarding Pass for your first class flight
                       Serial number: fc12
                       Seat number: %d
                       """.formatted((x+1));
               System.out.println(info3);
     }


     public static void economy(int x) {
          if (x >= 5 && x < 10){
               seats[x] = true;
          }
          String info3 = """
                       Your Boarding Pass for your economy class flight
                       Serial number: fc43
                       Seat number: %d
                       """.formatted((x+1));
          System.out.println(info3);
          }
}

