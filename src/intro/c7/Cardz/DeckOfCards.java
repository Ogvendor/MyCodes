package intro.c7.Cardz;

import java.security.SecureRandom;

public class DeckOfCards {
    private static final SecureRandom randonNumbers = new SecureRandom();
    private static final int number_of_cards = 52;

    private Card[] deck = new Card[number_of_cards];
    private int currentCard = 0;

    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0;count < deck.length;count++){
            deck[count] = new Card(faces[count % 13],suits[count/13]);
        }

    }
}
