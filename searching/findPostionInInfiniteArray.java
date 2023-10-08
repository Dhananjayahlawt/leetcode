
//Find position of an element in a sorted array of infinite numbers

import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = {
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      11,
      12,
      14,
      151,
      7,
      18,
      32,
      43,
      54,
      65,
      76,
      87,
    };
    int target = 9;
    int result = ans(arr, target);
    System.out.println(result);
  }

  static int ans(int[] arr, int target) {
    int start = 0;
    int end = 1;
    while (target > arr[end]) {
      int newStart = end + 1;
      end = end + (end - start + 1) * 2;
      start = newStart;
    }

    return binarySearch(arr, target, start, end);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
