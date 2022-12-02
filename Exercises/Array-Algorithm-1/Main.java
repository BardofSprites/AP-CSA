import java.util.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] numbers1 = { 12, 75, 3, 17, 65, 22 };
        System.out.println("The median value of the EVEN array is " + median(numbers1));

        int[] numbers2 = { 12, 75, 3, 17, 65, 22, 105 };
        System.out.println("\nThe median value of the ODD array is " + median(numbers2));

        int[] numbers3 = { 76, 75, 3, 17, 12, 22, 7 };
        System.out.println("The last multiple of 3 is " + findMultipleOfThree(numbers3));

    }

    public static double median(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        if (len % 2 == 0) {
            return (double) arr[len / 2];
        }
        return (double) (arr[((len - 1) / 2 + arr[len / 2]) / 2]);
    }

    public static int findMultipleOfThree(int[] arr) {
        Arrays.sort(arr);
        int total = 0;
        for (int i : arr) {
            total = total + i;
        }
        return total / arr.length;
    }
}
