import java.util.*;
public class Main
{
  public static void main (String[] args)
  {
    int [] arr={};
    int result = findMinimumNumber (arr);
    System.out.println (result);
  }
 
  static int findMinimumNumber(int [] arr){
     if(arr.length==0){
        return -1;
     }
      int minimum=arr[0];
     for(int element :arr){
        if(element<minimum ){
           minimum=element;
        }
     }
     return minimum;
  } 
}
