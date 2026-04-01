
public class _02_BubbleSortAlgorithm {
  public static void print(int[] arr) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // int[] arr = { 1, 7, 3, 8, 9, 12 };
    // swapping every two adjacent element if arr[i]>arr[i+1]
    // int[] arr = { 3, 1, 2, 5, 4 };

    int[] arr = { 5, 8, 1, -3, 8, 10 };
    print(arr);
    int n = arr.length;
    // bubble sort
    for (int x = 0; x < n - 1; x++) {
      for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
    print(arr);
    // bubble sort -2
    for (int x = 0; x < n - 1; x++) {
      for (int i = 0; i < n - 1 - x; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
    print(arr);
    // bubble sort -Optimized
    for (int x = 0; x < n - 1; x++) {
      boolean flag = true;
      for (int i = 0; i < n - 1 - x; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = false;
        }
      }
      // check if this pass has sorted or not
      if (flag == true)
        break;
    }
    print(arr);
  }
}
// bubble sort is stable sort algorithm