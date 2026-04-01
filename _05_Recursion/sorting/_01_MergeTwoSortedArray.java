
public class _01_MergeTwoSortedArray {
  public static void main(String[] args) {
    int a[] = { 10, 30, 50, 60, 80, 90 };
    int[] b = { 1, 42, 72, 78 };

    int[] c = new int[a.length + b.length];
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
    for (int ele : c) {
      System.out.print(ele + " ");
    }
  }
}
