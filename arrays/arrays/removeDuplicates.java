public class Main
{
  public static void main (String[]args)
  {
    int[] nums = { 1, 2, 2, 3, 3, 4, 5 };
    HashSet<Integer> numbers = new HashSet<Integer>();
    for (int element:nums){
    numbers.add(element);
 }
 Iterator value=numbers.iterator();
 int index=0;
 for(int element:numbers){
   nums[index++]=element;
 }
 int size=numbers.size();
 return size;
  }
}

