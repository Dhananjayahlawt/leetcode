import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 2, 3 },
      { 76, 87, 65, 34 },
      { 43, 23, 12, 87, 65, 43, 6 },
    };
    int target = 6;
    int[] result = searchIn2DArray(arr, target);
    System.out.println(Arrays.toString(result));
  }

  static int[] searchIn2DArray(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        if (arr[row][column] == target) {
          return new int[] { row, column };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
