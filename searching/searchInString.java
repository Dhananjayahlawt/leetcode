public class Main {

  public static void main(String[] args) {
    String name = "Dhananjay";
    char find = 'a';
    boolean result = search(name, find);
    System.out.println(result);
  }

  //Using for Each Loop return return if one occurence is present and retrun false if not present

  static boolean search(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (char element : str.toCharArray()) {
      if (element == target) {
        return true;
      }
    }
    return false;
  }

  //Using simple for loop
  static boolean search(String str, char target) {
    int length = str.lenght();
    if (length == 0) {
      return false;
    }
    for (int index = 0; index < length; index++) {
      if (str.charAt(index) == target) {
        return true;
      }
    }
    return false;
  }
}
