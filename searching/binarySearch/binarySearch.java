import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 6, 9, 11, 22, 32, 34 };
    int result = binarySearch(arr, 22);
    System.out.println(result);
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        //Calculate mid using this because if range of start+end excedd int range in java but using this it does not
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else if (arr[mid] > target) {
        end = mid - 1;
      }
    }
    return -1;
  }
}
