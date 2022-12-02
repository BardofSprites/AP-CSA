import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Part A
    int[ ] values = {17, 34, 56, 2, 19, 100};

    for (int i = 0; i < values.length; i++) {
      if (values[i] % 2 == 1){
        System.out.println(values[i] + " is odd");
      }
    }

    // Solution
    for (int i: values) {
        if (i % 2 == 1) {
            System.out.println(i + " is odd (for each loop)");
        }
    }

    //Part B
    int[] nums = {32, 56, 79, 2, 150, 37};

    int highestValue = findMax(nums);
    System.out.println("The highest score is " + highestValue);

  }

  public static int findMax(int[] numbers) {
    int maxSoFar = numbers[0];

    // for each loop to rewrite as for loop
    /*
    for (int num: numbers) {
      if (num > maxSoFar) {
         maxSoFar = num;
      }
    }
    */

    // Solution
    for (int i=0; i<numbers.length; i++) {
        if (i > maxSoFar) {
            maxSoFar = i;
        }
    }
    return maxSoFar;
  }
}
