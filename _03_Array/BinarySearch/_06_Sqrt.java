
class Solution {
  public int mySqrt(int x) {
    int lo = 0;
    int hi = x;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (mid * mid == x)
        return mid;
      else if (mid * mid > x)
        hi = mid - 1;
      else
        lo = mid + 1;
    }
    return hi;
  }
}

class Solution2 {
    public int mySqrt(int x) {
        if(x<=1)return x;
        int lo=0;
        int hi=x;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid)hi=mid-1;
            else if(mid<x/mid)lo=mid+1;
        }
        return hi;
    }
}

public class _06_Sqrt {
  public static void main(String[] args) {

  }
}
