class Solution {
  public boolean isLess(int mid, int[] arr, int t) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % mid == 0)
        sum += arr[i] / mid;
      else
        sum += arr[i] / mid + 1;
    }
    if (sum <= t)
      return true;
    else
      return false;
  }

  public int smallestDivisor(int[] arr, int t) {
    // Time limit exceeded
    // int n=arr.length;
    // int d;
    // int mx=-1;
    // for(int i=0;i<n;i++){
    // mx=Math.max(mx,arr[i]);
    // }
    // for( d=1; d<=mx;d++){
    // int sum=0;
    // for(int i=0;i<n;i++){
    // if(arr[i]%d==0)
    // sum+=arr[i]/d;
    // else sum+=arr[i]/d+1;
    // }
    // if(sum<=t) return d;
    // }
    // return d;

    // m-2
    // int n=arr.length;
    // int d=1;
    // int mx=Integer.MIN_VALUE;
    // for(int i=0;i<n;i++){
    // mx=Math.max(mx,arr[i]);
    // }

    // int lo=1; int hi=mx;
    // while(lo<=hi){
    // int mid=lo+(hi-lo)/2;
    // int sum=0;
    // for(int i=0;i<n;i++){
    // if(arr[i]%mid==0)
    // sum+=arr[i]/mid;
    // else sum+=arr[i]/mid+1;

    // }
    // if(sum<=t){
    // d=mid;
    // hi=mid-1;
    // }else lo=mid+1;
    // }
    // return d;

    int n = arr.length;
    int mx = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      mx = Math.max(mx, arr[i]);
    }

    int lo = 1;
    int hi = mx;
    int d = 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (isLess(mid, arr, t)) {
        d = mid;
        hi = mid - 1;

      } else
        lo = mid + 1;
    }

    return d;
  }
}

public class _09_SmallestDivisior {

}
