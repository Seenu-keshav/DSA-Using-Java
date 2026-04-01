public class _01_BinarySearch {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 46, 89, 97, 107, 146 };
    int target = 97;
    int n = arr.length;
    int lo = 0;
    int hi = n - 1;
    boolean flag = false;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (arr[mid] == target) {
        System.out.println("target found");
        flag = true;
        break;
      } else if (arr[mid] > target) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }

    }
    if (!flag) {
      System.out.println("data not found");
    }
  }
}
