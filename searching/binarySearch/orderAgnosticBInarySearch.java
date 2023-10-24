public class Main {

  public static void main(String[] args) {
    int[] arr = { 3, 5, 3, 2, 0 };
    int target = 3;
     int ans=findInMountainArray(arr);
    System.out.println(ans);
  }

  static int agonisticSearch(int arr[], int target, boolean isAsc) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target = arr[mid]) {
        return mid;
      } else if (arr[mid] < taregt) {
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
