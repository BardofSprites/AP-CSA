// Name: Daniel Pinkston
// Resources: None
// Date: 05/01/2022

import java.util.ArrayList;

class Player {
    private Deck deck;

    public Player() {}

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
        handValue += hand.get(0).getNumValue();
        handValue += hand.get(0).getNumValue();
        return handValue;
    }

    // TODO adds the parameter: Card card to the arraylist: Hand
    public void addCardToHand(Card card) {
        // FIXME .add method is not working for some reason, even though hand is an array of cards and all i am adding is a card.
        // hand.add(card);
    }

    // Hit method
    public ArrayList<Card> hit(ArrayList<Card> hand) {
        deck.shuffle();
        int random = (int)(Math.random() * deck.size());
        Card newCard = deck.draw(random);
        hand.add(newCard);
        return hand;
    }

    // Stand method
    public ArrayList<Card> stand(ArrayList<Card> hand) {
        return hand;
    }

    // TODO
    public String toString() {
    }
}
