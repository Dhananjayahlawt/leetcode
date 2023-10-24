public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 54, 65, 76, 54, 2, 2, 1 };
    int find = 87;
    int result = linearSearch(arr, find);
    System.out.println(result);
  }

  //Find the target elemnt in the given array If find return index otherwise return -1;
  static int linearSearch(int[] arr, int k) {
    int n = arr.length;
    if (n == 0) {
      return -1;
    }
    for (int index = 0; index < n; index++) {
      if (arr[index] == k) {
        return index;
      }
    }
    return -1;
  }

  //Using For Each Loop If eelement find return true else return false
  //Change result type to boolean if want t learn this

  static boolean linearSearch(int[] arr, int k) {
    int n = arr.length;
    for (int element : arr) {
      if (element == k) {
        return true;
      }
    }
    return false;
  }
}
