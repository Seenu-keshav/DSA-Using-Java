// Implement Upper Bound
//https://www.geeksforgeeks.org/problems/implement-upper-bound/1
class Solution {
  int upperBound(int[] arr, int target) {
    // code here
    int n = arr.length;
    int lo = 0;
    int hi = n - 1;
    int ub = n;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] > target) {
        ub = Math.min(ub, mid);
        hi = mid - 1;
      } else
        lo = mid + 1;
    }
    return ub;
  }
}

public class _03_UpperBound {

}
