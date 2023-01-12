// Name: Daniel Pinkston
// Resources: None
// Date: 04/01/2022

class Card {
    // Instance Variables
    private String value;
    private int numValue;
    private String suit;

    // Constructor
    // Creates a card with a value and suit
    public Card(int numValue, String value, String suit) {
        this.numValue = numValue;
        this.value = value;
        this.suit = suit;
    }

    // Getters

    // Returns the number of the card
    public int getNumValue() {
        return numValue;
    }

    // Returns the value of the card as an int
    public String getValue() {
        return value;
    }

    // Returns the suit of the card
    public String getSuit() {
        return suit;
    }

    // Prints the card
    public String toString(Card c) {
        if (c.getNumValue() > 10) {
            return value + " of " + suit;
        }
        return numValue + " of " + suit;
    }
}
