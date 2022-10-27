package intro.c7.Cardz;

public class Card {
    private final String face;
    private final String suits;

    public Card(String face,String suits){
        this.face = face;
        this.suits = suits;
    }


    public String toString() {
        return face + "of" + suits;
    }
}
