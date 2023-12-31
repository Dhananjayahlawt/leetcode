public class Main {

  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 2;
    int ans = findElementInRBS(arr, target);
    System.out.println(ans);
  }

  static int findElementInRBS(int[] arr, int target) {
    int pivot = findPivot(arr);
    int start = 0;
    int end = arr.length - 1;
    int result = agnosticBinarySearch(arr, 0, pivot, target, true);
    if (result == -1) {
      return agnosticBinarySearch(arr, pivot + 1, end, target, true);
    }
    return result;
  }

  static int agnosticBinarySearch(
    int[] arr,
    int start,
    int end,
    int target,
    boolean isAsc
  ) {
    while (start <= end) {
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
        if (arr[mid] < target) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      } else {
        if (arr[mid] <= arr[start]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
