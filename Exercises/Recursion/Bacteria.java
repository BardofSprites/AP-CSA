import java.util.*;

class Bacteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours will the bacteria breed? ");
        int hours = input.nextInt();
        int bacteria = colonySize(hours);
        System.out.println("After " + hours + " hour(s), there will be " + bacteria);
    }

    public static int colonySize(int hour) {
        // Write a base case
        if (hour == 0) {
            return 7;
        }
        // Write a recursive call
        else {
            return colonySize(hour - 1) + colonySize(hour - 1) * 4;
        }
    }
}
