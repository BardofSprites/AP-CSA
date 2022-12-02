public class ArrayAverage {
   private int[] values;

   public ArrayAverage(int[] theValues) {
      values = theValues;
   }

   public double getAverage() {
       int avg = 0;
       for (int i: values) {
           avg += i;
       }
       return avg / values.length;
   }
}
