// Name: Daniel Pinkston
// Resources: None
// Date: 05/01/2022

import java.util.ArrayList;

class Player {
    private Deck deck = new Deck();

    private ArrayList<Card> hand = new ArrayList<Card>();
    public Player() {}

    public ArrayList<Card> getHand() {
        return hand;
    }

    // Shuffles the deck and deals two cards to the player
    public void getStartHand() {
        deck.shuffle();
        int random1 = (int)(Math.random() * deck.size());
        int random2 = (int)(Math.random() * deck.size());
        Card draw1 = deck.draw(random1);
        Card draw2 = deck.draw(random2);
        hand.add(draw1);
        hand.add(draw2);
    }

    // Returns the value as an integer of the player's hand that was dealt
    public int getHandValue() {
        int handValue = 0;
        for (int i=0; i<hand.size(); i++) {
            handValue += hand.get(i).getNumValue();
        }
        return handValue;
    }

    // Hit method
    public void hit() {
        deck.shuffle();
        int random = (int)(Math.random() * deck.size());
        Card newCard = deck.draw(random);
        hand.add(newCard);
    }

    // toString method complete
    public String toString() {
        String tempString = "";
        for (int i=0; i<hand.size(); i++) {
            Card currentCard = hand.get(i);
            tempString += currentCard.toString(currentCard) + " ";
        }
        return tempString;
    }
}
