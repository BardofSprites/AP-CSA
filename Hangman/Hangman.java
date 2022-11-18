// Name: Daniel Pinkston
// Resources: readFile method: Bright Zheng

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class Hangman {
  // Scanner
  Scanner input = new Scanner("System.in");
  // Array that contains all of the guesses made
  private Arraylist<String> guess = new ArrayList<String>();
  // answer will be the 
  private String answer;
  // The random index that will be set in the randomIndex method
  private int index;
  // All of the guesses made by the user
  private String temp;
  // An array of all the words in the txt file
  private ArrayList<String> words = new ArrayList<String>();
  private int guessLeft;
  // int that is 10 
  // Finished
  public Hangman () {}

  // Finished
  public void readFile() {
    try {
      File wordFile = new File(".words.txt");
      Scanner wordScanner = new Scanner(wordFile);
      while (wordScanner.hasNextLine()) {
        words.add(wordScanner.nextLine()); 
      }
    } catch (Exception FileNotFoundException) {
        System.out.print("The words file was not found. Try again.");
        System.exit(0);
    }
  } 
  
  // Picks a random index
  public int randomIndex() {
    int index = Math.floor(Math.random() * words.size());
    return index;
  }

  // Finished
  public void roundStart() {
    System.out.println("You have " + guessLeft + " guesses left");
    System.out.println("You have guessed these letters: " + guess);
  }
  
  // To Do
  public void game() {
    // Number of incorrect answers
    int wrongGuess = 0;
    guessLeft = 6 - wrongGuess;
    while (wrongGuess < 6) {
      roundStart();
      if (temp.equals(answer))
      System.out.println("Enter a letter to guess: ");
      String userGuess = input.nextLine();
      guess.add(userGuess);
      for (int i=0; i<answer.length(); i++) {
        if (answer.substring(i,i+1).equals(userGuess)) {
          temp += userGuess;
          System.out.println("This answer is correct! \n" + temp);
          System.out.println("This guess was incorrect. You have: " + guessLeft + " left");
        }
        else if (userGuess.equals(temp.substring(i, i+1))) {
          System.out.println("You have already entered this letter"); 
          System.out.println("This guess was incorrect. You have: " + guessLeft + " left");
        }
        else {
          wrongGuess += 1;
          System.out.println("This guess was incorrect. You have: " + guessLeft + " left");
        }
      }
    }
  }

  // Finished
  public void hangman() {
    answer = words[index];
    System.out.println("Welcome to my Hangman Game!");
    System.out.println("You will have 6 tries to guess the word");
    game();
  } 

}
