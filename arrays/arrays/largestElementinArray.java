import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 432, 1, 1, 76, 554, 3 };
    int result = searchLargest(arr);
    System.out.println(result);
  }

  //Take Order of nlogn
  static int searchLargestBruteForce(int[] arr) {
    //If Array is unsoretd then sort
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  static int searchLargestOptimal(int[] arr) {
    int start = 0;
    int end = arr.length;
    int largest = arr[start];
    for (int element : arr) {
      if (largest < element) {
        largest = element;
      }
    }
    return largest;
  }
}
