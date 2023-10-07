import java.util.*;

//Better Approach

class Solution {

  //Ceiling of a numebr is the smallest number >=target;
  public int searchInsert(int[] nums, int target) {
    int length = nums.length;
    int start = 0;
    int end = length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }
}

//Second Approach
public class Main {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 15, 16, 28 };
    int target = 2;
    int result = ceilingNumber(arr, target);
    System.out.print(result);
  }

  static int ceilingNumber(int[] arr, int target) {
    int length = arr.length;
    int start = 0;
    int end = length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target > arr[mid]) {
        start = mid + 1;
      } else if (arr[mid] == target) {
        return target;
      } else {
        if (arr[mid - 1] < target) {
          return arr[mid];
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
