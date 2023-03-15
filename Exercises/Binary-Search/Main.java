import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 0 1 2 3 4 5
        int[] arrEven = { 2, 4, 6, 8, 10, 12 };
        int[] arrOdd = { 2, 4, 6, 8, 10 };

        printResult(arrEven, 6, 2);
        printResult(arrEven, 8, 3);
        printResult(arrEven, 2, 0);
        printResult(arrEven, 12, 5);
        printResult(arrEven, 3, -1);
        printResult(arrEven, 11, -1);
        printResult(arrEven, 15, -1);
        printResult(arrEven, 1, -1);

        printResult(arrOdd, 6, 2);
        printResult(arrOdd, 8, 3);
        printResult(arrOdd, 2, 0);
        printResult(arrOdd, 12, -1);
        printResult(arrOdd, 3, -1);
        printResult(arrOdd, 11, -1);
        printResult(arrOdd, 15, -1);
        printResult(arrOdd, 1, -1);

        System.out.println("-- Recursively --");

        printResultR(arrEven, 6, 2);
        printResultR(arrEven, 8, 3);
        printResultR(arrEven, 2, 0);
        printResultR(arrEven, 12, 5);
        printResultR(arrEven, 3, -1);
        printResultR(arrEven, 11, -1);
        printResultR(arrEven, 15, -1);
        printResultR(arrEven, 1, -1);

        printResultR(arrOdd, 6, 2);
        printResultR(arrOdd, 8, 3);
        printResultR(arrOdd, 2, 0);
        printResultR(arrOdd, 12, -1);
        printResultR(arrOdd, 3, -1);
        printResultR(arrOdd, 11, -1);
        printResultR(arrOdd, 15, -1);
        printResultR(arrOdd, 1, -1);

    }

    public static void printResult(int[] arr, int target, int expected) {
        BinarySearcher finder = new BinarySearcher();
        System.out.println("Searching for " + target + " in " + Arrays.toString(arr));
        int result = finder.binarySearch(arr, target);
        System.out.println("* " + expected + " expected, " + result + " found.");
    }

    public static void printResultR(int[] arr, int target, int expected) {
        BinarySearcher finder = new BinarySearcher();
        System.out.println("Searching for " + target + " in " + Arrays.toString(arr));
        int result = finder.binarySearchRecursive(arr, target);
        System.out.println("* " + expected + " expected, " + result + " found.");
    }
}
