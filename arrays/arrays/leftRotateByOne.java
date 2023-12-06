import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 7, 8, 4, 3 };
    int length = arr.length;
    leftRotateByOne(arr, length);
    System.out.println(Arrays.toString(arr));
  }

  static void leftRotateByOne(int[] arr, int length) {
    int temp = arr[0];
    for (int index = 1; index < length; index++) {
      arr[index - 1] = arr[index];
    }
    arr[length - 1] = temp;
  }
}
