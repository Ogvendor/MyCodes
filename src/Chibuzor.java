import java.security.SecureRandom;
import java.util.Scanner;

public class Chibuzor {

   static int[] deck = new int[52];
   static String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
    static String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","jack","Queen","King"};
    static SecureRandom random = new SecureRandom();
    //Initialize the cards
   static void initializeTheCards(){
       for(int v = 0;v < deck.length;v++)
           deck[v] = v;
   }


    //Shuffle the cards
   static void  shuffle() {
       for (int v = 0; v < deck.length; v++) {
           //Generate an index randomly
           int index = (int) (Math.random() * deck.length);
           int temp = deck[v];
           deck[v] = deck[index];
           deck[index] = temp;
       }
   }
        static void shuffleAgain(){
            for(int v = 0;v < deck.length;v++){
                int index1 = random.nextInt(6);

                System.out.printf("%d ", index1);
            }
       }




    //Display the first four cards
    static void display() {
        for (int v = 0; v < 4; v++) {
            String suit = suits[deck[v] / 13];
            String rank = ranks[deck[v] % 13];
            System.out.println("Card number " + deck[v] + ":" + rank + "of" + suit);
        }
    }




    public static void main(String[] args) {

       initializeTheCards();
       shuffle();
       display();
        shuffleAgain();


        }
    }

