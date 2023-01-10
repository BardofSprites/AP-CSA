// Name: Daniel Pinkston
// Resources: None
// Date: 4/1/2022

import java.util.ArrayList;

class Deck {
    // Instance Variables
    private ArrayList<Card> deck = new ArrayList<Card>();

    // Constructor
    // Creates a deck of 52 cards
    public Deck() {
        for (int i = 1; i <= 13; i++) {
            if (i >= 10) {
                deck.add(new Card(10,"J","Hearts"));
                deck.add(new Card(10,"J","Diamonds"));
                deck.add(new Card(10,"J","Clubs"));
                deck.add(new Card(10,"J","Spades"));
            }
            else if (i >= 11) {
                deck.add(new Card(10,"Q","Hearts"));
                deck.add(new Card(10,"Q","Diamonds"));
                deck.add(new Card(10,"Q","Clubs"));
                deck.add(new Card(10,"Q","Spades"));
            }
            else if (i >= 12) {
                deck.add(new Card(10,"K","Hearts"));
                deck.add(new Card(10,"K","Diamonds"));
                deck.add(new Card(10,"K","Clubs"));
                deck.add(new Card(10,"K","Spades"));
            }
            else {
                deck.add(new Card(i,"","Hearts"));
                deck.add(new Card(i,"","Diamonds"));
                deck.add(new Card(i,"","Clubs"));
                deck.add(new Card(i,"","Spades"));
            }
        }
    }

    // Draw a card. Removes a card from the deck and returns it
    public Card draw(int index) {
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }

    // Shuffle the deck
    public void shuffle() {
        for (int i=0; i<deck.size(); i++) {
            int random = (int)(Math.random() * deck.size());
            Card temp = deck.get(i);
            deck.remove(i);
            deck.add(random, temp);
        }
    }

    // Returns the size of the deck
    public int size() {
        return deck.size();
    }

    // TODO ToString Method
    public String toString() {
        String str = "";
        for (int i=0; i<deck.size(); i++) {
            str += deck.get(i);
            if (i < deck.size()-1) {
                str += ", ";
            }
        }
        return str;
    }
}
