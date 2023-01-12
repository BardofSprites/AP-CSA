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
    private boolean userDone = false;
    private boolean cpuDone = false;
    private String winner = "";

    // Scanner
    Scanner input = new Scanner(System.in);

    // Constructor
    public Game() {}

    public void dealCards() {
        // Deal two cards to the user and cpu
        user.getStartHand();
        cpu.getStartHand();
    }

    public boolean checkBust(Player p) {
        if (p.getHandValue() > 21) {
            return true;
        }
        return false;
    }

    public boolean checkBlackJack(Player p) {
        if (p.getHandValue() == 21) {
            return true;
        }
        return false;
    }

    public Player checkGreater(Player p1, Player p2) {
        if (p1.getHandValue() > p2.getHandValue()) {
            if (checkBust(p1) == true) {
                return p2;
            }
            else {
                return p1;
            }
        }
        else if (p1.getHandValue() < p2.getHandValue()) {
            if (checkBust(p2) == true) {
                return p1;
            }
            else {
                return p2;
            }
        }
        else {
            return p2;
        }
    }

    // p1 is the user and p2 is the cpu
    public boolean checkWin(Player p1, Player p2) {
        if (checkBust(p1) == true) {
            winner = "dealer";
            return true;
        }
        else if (checkBust(p2) == true) {
            winner = "player";
            return true;
        }
        if (checkBlackJack(p1) == true) {
            winner = "player";
            return true;
        }
        else if (checkBlackJack(p2) == true) {
            winner = "dealer";
            return true;
        }
        return false;
    }

    public void printWin(Player p1, Player p2) {
        if (checkGreater(p1,p2) == p1) {
            winner = "player";
        }
        else {
            winner = "dealer";
        }
        System.out.println(winner.toUpperCase() + " is the winner!");
        System.out.println("Your hand: " + user.toString() + "Your value: " + user.getHandValue() + "\n Dealer's hand: " + cpu.toString() + "Dealer's value: " + cpu.getHandValue());
    }

    public void startGame() {
        // Create a new deck
        deck = new Deck();
        // Shuffle the deck
        deck.shuffle();
        // Deal the cards to both of the players if the round is not round 1
        dealCards();
        while (checkWin(user,cpu) != true) {
            // Display the user's cards
            System.out.println("Your hand: " + user.toString() + " ");
            System.out.println("Your hand value: " + user.getHandValue());
            // Give the user the choice to stand or hit
            System.out.println("Hit (no to stand)? (y/n)");
            String choice = input.nextLine();
            if (choice.equals("y")) {
                user.hit();
            }
            else if (choice.equals("n")) {
                userDone = true;
            }
            else {
                System.out.println("invalid input, this will count as a stand");
            }
            // cpu will hit until it has a hand value of 17 or higher
            if (cpu.getHandValue() < 17) {
                cpu.hit();
            }
            else {
                cpuDone = true;
            }
            if (userDone == true) {
                break;
            }
        }
        printWin(user,cpu);
    }
}
