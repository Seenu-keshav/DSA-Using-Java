public class _04_Selection_Sort {
  static void print(int[] arr) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // in every pass we find the kth smallest element and put it int its right place
    int[] arr = { 10, -4, 20, 1, 8, -6 };
    int n = arr.length;

    for (int x = 0; x < n; x++) {
      int min = Integer.MAX_VALUE;
      int mindex = -1;
      for (int i = x; i < n; i++) {
        if (arr[i] < min) {
          min = arr[i];
          mindex = i;
        }
      }
      // swap arr[x],arr[mindex]
      int temp = arr[x];
      arr[x] = arr[mindex];
      arr[mindex] = temp;
    }
    print(arr);
  }
}
