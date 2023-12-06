public class Main {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 7, 7, 5, 5 };
    int length = array.length;
    int largest = array[0];
    int secondLargest = -1;
    for (int i = 1; i < array.length; i++) {
      if (array[i] > largest) {
        int temp = largest;
        largest = array[i];
        secondLargest = temp;
      } else if (array[i] > secondLargest && array[i] != largest) {
        secondLargest = array[i];
      }
    }
    System.out.println(secondLargest);
  }
}
