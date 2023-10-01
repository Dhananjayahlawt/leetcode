import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 54, 65, 76, 87, 23, 54, 9, 87 };
    int target = 87;
    int result = search(arr, target, 7, 10);
    System.out.println(result);
  }

  static int search(int[] arr, int target, int start, int end) {
    for (int index = start; index <= end; index++) {
      if (arr[index] == target) {
        return index;
      }
    }
    return -1;
  }
}
