import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 2, 3 },
      { 76, 87, 65, 34 },
      { 43, 23, 12, 87, 65, 99, 43, 6 },
    };
    int result = maxIn2DArray(arr);
    System.out.println(result);
  }

  static int maxIn2DArray(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] ints : arr) {
      for (int intan : ints) {
        if (intan > max) {
          max = intan;
        }
      }
    }

    return max;
  }
}
