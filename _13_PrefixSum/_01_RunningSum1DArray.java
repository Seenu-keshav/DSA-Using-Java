class Solution {
    public int[] runningSum(int[] nums) {
       
         for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
         }
             return nums;
          }
      
}
public class _01_RunningSum1DArray {
  
}
