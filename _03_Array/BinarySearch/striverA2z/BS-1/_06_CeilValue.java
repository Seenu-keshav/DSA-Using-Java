// Ceil in a Sorted Array
//https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1

// User function Template for Java
class Solution {
  public int findCeil(int[] arr, int x) {
    // code here

    int n = arr.length;
    int lo = 0;
    int hi = n - 1;
    int ceilidx = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] >= x) {
        ceilidx = mid;
        hi = mid - 1;
      } else
        lo = mid + 1;
    }
    return ceilidx;
  }
}

public class _06_CeilValue {

}
