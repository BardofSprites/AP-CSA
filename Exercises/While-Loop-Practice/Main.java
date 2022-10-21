import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int cooked = 270;

    System.out.println("Enter your temperature: ");
    int temp = input.nextInt();

    while(temp<270) {
      System.out.println("Not ready yet");
      System.out.println("Enter your temperature: ");
      temp = input.nextInt();
    } 
  }
}
