//Finf first occurence of a numebe in non-decreasing order array of integers;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 2, 4, 8, 8, 9, 9, 9, 9, 9, 12 };
    int target = 0;
    int result = FindFirstOccurenc(arr, target);
    System.out.print(result);
  }

  static int FindFirstOccurenc(int[] arr, int target) {
    int start = 0;
    int end = arr.length;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    if (arr[start] == target) {
      return start;
    }
    return -1;
  }
}
