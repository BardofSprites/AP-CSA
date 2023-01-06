// Name: Daniel Pinkston
// Resources: None
// Date: 04/01/2022

class Card {
    // Instance Variables
    private int value;
    private String suit;

    // Constructor
    // Creates a card with a value and suit
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    // Getters

    // Returns the number of the card
    public int getValue() {
        return value;
    }

    // Returns the suit of the card
    public String getSuit() {
        return suit;
    }

    // Prints the card
    public String toString() {
        return value + " of " + suit;
    }
}
