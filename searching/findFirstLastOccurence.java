class Solution {

  public int[] searchRange(int[] nums, int target) {
    int[] result = { -1, -1 };
    int start = search(nums, target, true);
    int end = search(nums, target, false);
    result[0] = start;
    result[1] = end;
    return result;
  }

  int search(int[] arr, int target, boolean isFirstIndex) {
    int start = 0;
    int end = arr.length - 1;
    int ans = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        ans = mid;
        if (isFirstIndex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }
}
