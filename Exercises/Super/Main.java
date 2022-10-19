import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your the student name:");
    String name = input.nextLine();
    System.out.println("Enter your math score:");
    int math = input.nextInt();
    System.out.println("Enter your ela score:");
    int ela = input.nextInt();
    System.out.println("Enter your service hours:");
    int hours = input.nextInt();

    HSStudent student = new HSStudent(name, math, ela, hours);
    System.out.println("Pass math? " + student.passMath());
    System.out.println("Pass ela? " + student.passEla());
    System.out.println("Complete service? " + student.completeService());
    System.out.println(student.getName() + " has qualified for graduation? " + student.gradQualify());
  }
}    