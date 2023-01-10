// Name: Daniel Pinkston
// Resources: None
// Date: 06/01/2023

import java.util.Scanner;
import java.util.ArrayList;

class Game {
    // The deck
    private Deck deck;
    // The player
    private Player user = new Player();
    private Player cpu = new Player();
    public Game() {}

    public void dealCards() {
        // Deal two cards to the user and cpu
        int randomDraw1 = (int) (Math.random() * 52);
        int randomDraw2 = (int) (Math.random() * 52);
        // user.add(deck.draw(randomDraw1));
        // cpu.add(deck.draw(randomDraw2));
    }

    // TODO finish the method
    // FIXME player.toString method is not complete and is subject to change
    public String toString() {
        return "Player's hand: " + player.toString() + ", CPU's hand: " + cpu.toString();
    }

    public void startGame() {
        // Create a new deck
        deck = new Deck();
        // Shuffle the deck
        deck.shuffle();
        // Deal the cards
        dealCards();
        // Display the cards
        // TODO THIS
        // toString();
        // displayCards();
        // Check for a winner
        // checkWinner();
    }
}
