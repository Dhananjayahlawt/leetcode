//Find Smallest Letter Greater Than Target

class Solution {

  public char nextGreatestLetter(char[] letters, char target) {
    int length = letters.length;
    int start = 0;
    int end = length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    // if(start==length){
    //     return letters[0];
    // }
    // return letters[start];
    return letters[start % length];
  }
}
