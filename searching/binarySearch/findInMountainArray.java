public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
    int target = 3;
    //  int ans=agonisticSearch(arr,target,0,arr.length-1,true);
    int ans = findInMountainArray(arr, target);
    System.out.println(ans);
  }

  static int findInMountainArray(int arr[], int target) {
    int end = arr.length;
    int peakIndex = searchPeakInMountain(arr);
    if (arr[peakIndex] == target) {
      return peakIndex;
    }

    int result = agonisticSearch(arr, target, 0, peakIndex - 1, true);
    if (result == -1) {
      return agonisticSearch(arr, target, peakIndex + 1, end, false);
    }
    return result;
  }

  static int searchPeakInMountain(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  static int agonisticSearch(
    int arr[],
    int target,
    int start,
    int end,
    boolean isAsc
  ) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target == arr[mid]) {
        return mid;
      } else if (arr[mid] < target) {
        if (isAsc) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (isAsc) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
