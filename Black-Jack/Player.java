// Name: Daniel Pinkston
// Resources: None
// Date: 05/01/2022

import java.util.ArrayList;

class Player {
    private Deck deck;

    public Player(Deck d) {
        deck = d;
    }

    // Shuffles the deck and deals two cards to the player
    public ArrayList<Card> getHand() {
        System.out.println("Player's hand: ");
        deck.shuffle();
        int random1 = (int)(Math.random() * deck.size());
        int random2 = (int)(Math.random() * deck.size());
        Card draw1 = deck.draw(random1);
        Card draw2 = deck.draw(random2);
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(draw1);
        hand.add(draw2);
        return hand;
    }

    // Returns the value as an integer of the player's hand that was dealt
    public int getHandValue(ArrayList<Card> hand) {
        int handValue = 0;
        handValue += hand.get(0).getValue();
        handValue += hand.get(0).getValue();
        return handValue;
    }

    // Hit method
    public ArrayList<Card> hit(ArrayList<Card> hand) {
        deck.shuffle();
        int random = (int)(Math.random() * deck.size());
        Card newCard = deck.draw(random);
        hand.add(newCard);
        return hand;
    }

    // TODO
    // Stand method
    // comparison of hand from dealer
}
