// Name: Daniel Pinkston
// Resources:

import java.util.*;

class Main {
  public static final String RESET = "\u001B[0m";
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";
  String[] colors = [4];
  
  public String[] randColors(String[] val) {
    int randInt = Math.floor(Math.random() * 9);
    ArrayList<String> allOptions = new ArrayList<String>();
    allOptions.add("RESET");
    allOptions.add("BLACK");
    allOptions.add("RED");
    allOptions.add("GREEN");
    allOptions.add("YELLOW");
    allOptions.add("BLUE");
    allOptions.add("PURPLE");
    allOptions.add("CYAN");
    allOptions.add("WHITE");
    System.out.println(randInt);
    System.out.println(allOptions);
  }

  public static void main(String[] args) {
    
    // Examples of how to aply color to your text
    // Static variable name + text you want to be that color
    System.out.println(RED+"Red");
    System.out.println(GREEN+"Green");
    System.out.println(BLACK+"Black");
    System.out.println(WHITE+"White");
    System.out.println(YELLOW+"Yellow");       
    System.out.println(BLUE+"Blue");
    System.out.println(PURPLE+"Purple");
    System.out.println(CYAN+"Cyan");
    System.out.println(RESET+"Back to normal");
    System.out.println(BLUE+"K"+YELLOW+"C"+BLUE+"D");
  }
  
}
}
