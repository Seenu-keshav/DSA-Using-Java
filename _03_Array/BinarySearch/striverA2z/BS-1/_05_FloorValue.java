// Floor in Sorted Array
//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

class Solution {
  public int findFloor(int[] arr, int x) {
    // code here
    int n = arr.length;
    int lo = 0;
    int hi = n - 1;
    int flooridx = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] <= x) {
        flooridx = mid;
        lo = mid + 1;
      } else
        hi = mid - 1;
    }
    return flooridx;

  }
}

public class _05_FloorValue {

}
