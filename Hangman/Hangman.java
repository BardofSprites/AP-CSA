// Name: Daniel Pinkston
// Resources: readFile method: Bright Zheng

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
  // Scanner
  Scanner input = new Scanner(System.in);
  // Array that contains all of the guesses made
  private ArrayList<String> guess = new ArrayList<String>();
  // answer will be the real answer
  private String answer;
  // The random index that will be set in the randomIndex method
  private double index = 0;
  // All of the guesses made by the user
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();
  // An array of all the words in the txt file
  private ArrayList<String> words = new ArrayList<String>();
  // The amount of guesses that the user has left
  private int guessLeft;
  // the user's input
  private String userGuess;
  // the amount of incorrect guesses made => must be less than six for the person to win
  private int wrongGuess = 0;
  // Correctly placed letters => "____g" (like this)
  private ArrayList<Character> revealedAnswers = new ArrayList<Character>();

  // Finished
  public Hangman () {}

  // Finished
  public void readFile() {
    try {
      File wordFile = new File("./words.txt");
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
    index = Math.floor(Math.random() * words.size());
    return (int) index;
  }

  // Finished
  public void roundStart() {
    System.out.println("You have " + guessLeft + " guesses left");
  }

  // Checks if there are any more spaces left in the revealedAnswers
  public boolean gameOver() {
    for(int i=0; i<revealedAnswers.size(); i++) {
      if(revealedAnswers.get(i) == '_') {
        return false;
      }
    }
    return true;
  }

  public void game() {
    // Number of guesses what the user has left
    guessLeft = 6 - wrongGuess;
    System.out.println(guessLeft);
    while (wrongGuess < 6) {
      if(gameOver() == true) {
        break;
      }
      roundStart();
      System.out.println("Enter a letter to guess: ");
      userGuess = input.nextLine();
      char currentChar = userGuess.charAt(0);
      if(isAlreadyGuessed(currentChar) == true) {
        // Print out the full list of already guessed letters
        System.out.println(guessedLetters);
        System.out.println("You have already guessed this letter. Try again");
      }
      else {
        // if currentChar is in the answer and if it is correct
        // then update revealedAnswers
        // else inform the user that their guess was incorrect
        if(guessInAnswer(currentChar)) {
          System.out.println("You have guessed a letter correctly");
          for(int i=0; i<revealedAnswers.size(); i++) {
            System.out.print(revealedAnswers.get(i) + " ");
          }
          System.out.println("");
        }
        else {
          System.out.println("Your guess was incorrect");
          wrongGuess = wrongGuess + 1;
          guessLeft -= 1;
        }
      }
    }
  }

  // checks if the inputChar is in guessedLetters
  public boolean isAlreadyGuessed(char inputChar) {
    for(int i=0; i<guessedLetters.size(); i++) {
      if(guessedLetters.get(i).equals(inputChar)) {
        return true;
      }
    }
    return false;
  }
  // Maintain revealedAnswers when the currentChar is found in the solution TODO
  public boolean guessInAnswer(char inputChar) {
    boolean returnState = false;
    for (int i=0; i<answer.length(); i++) {
      if (answer.charAt(i) == inputChar) {
        returnState = true;
      }
    }
    // Substitute the current character inside the revealed answer for every match in the array
    for (int i=0; i<answer.length(); i++) {
      if (answer.charAt(i) == inputChar) {
        revealedAnswers.set(i,inputChar);
      }
    }
    return returnState;
  }
  // Finished
  public void gameFunc() {
    readFile();
    answer = words.get(randomIndex());
    answer = answer.toLowerCase();
    int answerLength = answer.length();
    for(int i=0; i<answerLength; i++) {
      revealedAnswers.add('_');
    }

    System.out.println("Welcome to my Hangman Game!");
    System.out.println("You will have 6 tries to guess the word. This system will only accept one character per guess.");
    game();
  } 
}
