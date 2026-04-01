public class _02_LowerBound {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 46, 89, 97, 107, 146 };
    int n = arr.length;
    int target = 50;
    int lo = 0;
    int hi = n - 1;
    int lb = n;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] >= target) {
        lb = Math.min(lb, mid);
        hi = mid - 1;
      } else
        lo = mid + 1;
    }
    System.out.println(lb);
  }
}
