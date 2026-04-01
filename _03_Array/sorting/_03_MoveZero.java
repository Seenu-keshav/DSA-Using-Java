class Solution {
    public void moveZeroes(int[] nums) {
    //  ArrayList<Integer> al=new ArrayList<>();
    //  int n=nums.length;
    //  int noz=0;
    //  for(int i=0;i<n;i++){
    //     if(nums[i]!=0){
    //         al.add(nums[i]);
    //     }else noz++;
    //  }   
    //  for(int i=1;i<=noz;i++){
    //     al.add(0);
    //  }
    //  for(int i=0;i<nums.length;i++){
    //     nums[i]=al.get(i);
    //  }

       int noz=0;
       for(int elem:nums){
        if(elem==0)noz++;
       }
      int n=nums.length;
      for(int i=0;i<noz;i++){
        for(int j=0;j<n-1-i;j++){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
      }
    }
}