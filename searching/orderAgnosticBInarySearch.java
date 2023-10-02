import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 34, 32, 23, 22, 11, 9, 7, 4, 3, 1 };
    //  int[] arr = { 1,2,5,8,10,12,16,17,23,45,65,67,89};
    int result = orderAgnosticBinarySearch(arr, 32);
    System.out.println(result);
  }

  //Work for both Ascending and descending order
  static int orderAgnosticBinarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    boolean isAsc = arr[start] < arr[end];
    while (start <= end) {
      //Calculate mid using this because if range of start+end excedd int range in java but using this it does not
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (isAsc) {
        if (arr[mid] < target) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (arr[mid] > target) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
