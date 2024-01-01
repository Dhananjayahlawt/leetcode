class Solution {
    public void rotate(int[] nums, int k) {
    int length=nums.length;
     if (length == 0) return;
      k=k%length;
      reverse(nums,0,length-1);
      reverse(nums,0,k-1);
      reverse(nums,k,length-1);
        
    }
    public static void reverse(int [] nums,int start,int end ){
       int temp;
      while(start<=end){
         temp=nums[start];
         nums[start]=nums[end];
         nums[end]=temp;    
         start++;
         end--;
      }
    }
}