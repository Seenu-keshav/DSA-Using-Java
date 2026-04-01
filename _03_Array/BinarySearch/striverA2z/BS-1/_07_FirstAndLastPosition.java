// Find the first or last occurrence of a given number in a sorted array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
  public int[] searchRange(int[] arr, int target) {
    // int[] ans={-1,-1};
    // int n=arr.length;
    // int lo=0,hi=n-1;
    // // first check element is present or not
    // boolean flag=false;
    // while(lo<=hi){
    // int mid=lo+(hi-lo)/2;
    // if(arr[mid]==target){
    // flag=true;
    // break;
    // }else if(arr[mid]>target) hi=mid-1;
    // else if(arr[mid]<target) lo=mid+1;
    // }
    // // now find lower bound

    // if(flag==false) return ans;
    // lo=0; hi=n-1;
    // int lb=n;
    // while(lo<=hi){
    // int mid=lo+(hi-lo)/2;
    // if(arr[mid]>=target){
    // lb=Math.min(lb,mid);
    // hi=mid-1;
    // }else lo=mid+1;
    // }
    // ans[0]=lb;

    // // now found upper bound
    // lo=0; hi=n-1;
    // int ub=n;
    // while(lo<=hi){
    // int mid=lo+(hi-lo)/2;
    // if(arr[mid]>target){
    // ub=Math.min(ub,mid);
    // hi=mid-1;
    // }else lo=mid+1;
    // }
    // ans[1]=ub-1;
    // return ans;

    int n = arr.length;
    int[] ans = new int[2];
    int lo, hi;
    // first position
    int fp = -1;
    lo = 0;
    hi = n - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] == target) {

        if (mid > 0 && arr[mid] == arr[mid - 1]) {
          hi = mid - 1;
        } else {

          fp = mid;
          break;
        }

      } else if (arr[mid] > target)
        hi = mid - 1;
      else if (arr[mid] < target)
        lo = mid + 1;
    }

    int lp = -1;
    lo = 0;
    hi = n - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] == target) {
        if (mid + 1 < n && arr[mid] == arr[mid + 1]) {
          lo = mid + 1;
        } else {
          lp = mid;
          break;
        }
      } else if (arr[mid] > target)
        hi = mid - 1;
      else if (arr[mid] < target)
        lo = mid + 1;
    }
    ans[0] = fp;
    ans[1] = lp;
    return ans;
  }
}

public class _07_FirstAndLastPosition {

}
