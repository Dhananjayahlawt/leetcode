//Search the element in infinite  sorted array ;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 6, 7, 8, 12, 13, 19, 21, 25, 28, 34, 36, 38 };
    int target = 12;
    int ans = findtarget(arr, target);
    System.out.println(ans);
  }

  static int findtarget(int[] arr, int target) {
    int start = 0;
    int end = 1;
    while (target > arr[end]) {
      if (target > arr[end]) {
        int temp = end + 1;
        end = end + (end - start + 1) * 2;
        start = temp;
      }
    }
    return binarySearch(arr, target, start, end);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    System.out.println(start);
    System.out.println(end);
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < target) {
        start = mid + 1;
      } else if (arr[mid] == target) {
        return mid;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
