class Solution {

    int money(int[]nums,int[] dp,int i){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+money(nums,dp,i+2);
        int skip=money(nums,dp,i+1);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return money(nums,dp,0);
    }
}

public class _03_House_Robber {
  
}
