class Solution {

  public int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    if (nums[start] <= nums[end]) {
      return nums[0];
    }
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid > start && nums[mid] < nums[mid - 1]) {
        return nums[mid];
      } else if (mid < end && nums[mid] > nums[mid + 1]) {
        return nums[mid + 1];
      } else {
        if (nums[mid] > nums[start]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
