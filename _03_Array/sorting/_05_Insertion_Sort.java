
public class _05_Insertion_Sort {
  static void print(int arr[]) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 1, 4, 2 };
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i; j >= 1; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
    print(arr);
  }
}
