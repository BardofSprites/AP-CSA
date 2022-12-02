class Main {
    public static void main(String[] args) {
        String[] arr1 = new String[] { "w", "x", "y", "z" };
        printArr(arr1);

        String[] arr2 = new String[] { "a", "b", "c" };
        printArr(arr2);

        int[] oddIndexArray = new int[] { 1, 2, 3, 4, 5 };
        printOddIndices(oddIndexArray);
    }

    public static void printArr(String[] arr) {
        // Print everything in the array on its own line
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printOddIndices(int[] arr) {
        // your code goes here!
        for (int i = 1; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
    }
}
