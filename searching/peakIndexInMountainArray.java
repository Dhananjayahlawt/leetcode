class Solution {

  public int peakIndexInMountainArray(int[] arr) {
    if (arr.length < 3) {
      return -1;
    }
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
        return mid;
      } else if (arr[mid] > arr[mid - 1]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
