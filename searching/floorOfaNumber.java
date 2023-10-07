class Solution {

  //floor of a number is the greaternumber<=target;
  public int floorOfaNumber(int[] nums, int target) {
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
    return end;
  }
}
