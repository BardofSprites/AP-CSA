import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int num = input.nextInt();
        System.out.println(countdown(num));
    }
    public static String countdown(int number) {
        if (number == 0) {
            return "Blastoff!";
        }
        return number + ", " + countdown(number - 1);
    }
}
