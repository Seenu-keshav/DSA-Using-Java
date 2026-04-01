	
// Implement Lower Bound 
//https://www.geeksforgeeks.org/problems/implement-lower-bound/1
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int lb=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }else lo=mid+1;
        }
        return lb;
    }
}

public class _02_LowerBound {
  
}
