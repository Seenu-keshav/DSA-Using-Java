
public class _02_MergeSort {
  public static void print(int[] arr) {
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void merge(int[] a, int[] b, int c[]) {
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] > b[j]) {
        c[k] = b[j];

        j++;
        k++;
      } else {
        c[k] = a[i];
        i++;
        k++;

      }
    }
    if (i == a.length) {
      while (j < b.length) {
        c[k] = b[j];

        j++;
        k++;
      }
    }
    if (j == b.length) {
      while (i < a.length) {
        c[k] = a[i];
        i++;
        k++;
      }
    }
  }

  public static void mergeSort(int arr[]) {
    int n = arr.length;
    if (n == 1)
      return;
    // create two arrays
    int[] a = new int[n / 2];
    int[] b = new int[n - n / 2];
    // copy pasting
    for (int i = 0; i < n / 2; i++) {
      a[i] = arr[i];
    }
    for (int i = 0; i < n - n / 2; i++) {
      b[i] = arr[i + n / 2];
    }
    mergeSort(a);
    mergeSort(b);
    merge(a, b, arr);
  }

  public static void main(String[] args) {

    int arr[] = { 80, 30, 50, 20, 60, 10, 70, 40 };
    print(arr);
    mergeSort(arr);
    print(arr);
  }
}
