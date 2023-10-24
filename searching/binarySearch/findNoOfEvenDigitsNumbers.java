import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 123, 432, 21, 22, 34, 56, 1, 1, 1, 1 };
    int result = FindNumberWithEvenDigits(arr);
    System.out.println(result);
  }

  static int FindNumberWithEvenDigits(int[] arr) {
    int noOfEvenDigits = 0;
    for (int element : arr) {
      int count = 0;
      while (element > 0) {
        element /= 10;
        count++;
      }
      if (count % 2 == 0) {
        noOfEvenDigits++;
      }
    }
    return noOfEvenDigits;
  }
}
