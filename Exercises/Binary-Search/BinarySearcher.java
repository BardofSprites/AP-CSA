public class BinarySearcher {
    /*
     * Implementation of the Binary Search algorithm.
     *
     * @param arr the array being searched
     *
     * @param target the value being searched for
     *
     * @return int the index of target in arr, or -1 if it's not there
     */
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int target) {
        // DO NOT EDIT THIS METHOD!
        // call the recursive helper method
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    /*
     * Recursive implementation of the Binary Search algorithm.
     *
     * @param arr the array being searched
     *
     * @param target the value being searched for
     *
     * @param left the index of the left-most value to be searched, inclusive
     *
     * @param right the index of the right-most value to be searched, inclusive
     *
     * @return int the index of target in arr, or -1 if it's not there
     */
    private int binarySearchRecursive(int[] arr, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
}
