class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    // int n=arr.length;
    // for(int i=1; i<=n-2;i++){
    // if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])return i;
    // }
    // return 1223;

    int n = arr.length;
    int lo = 1, hi = n - 2;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
        return mid;
      else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
        lo = mid + 1;
      else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1])
        hi = mid - 1;
    }
    return -1;
  }
}

public class _05_FindPeakElement {
  public static void main(String[] args) {

  }
}
