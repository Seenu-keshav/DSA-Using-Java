public class _17_Merge_Two_Sorted_Array {
  public static void main(String[] args) {
    int[] a = { 11, 33, 42, 71 };
    int[] b = { 26, 54, 69, 81 };

    int c[] = new int[a.length + b.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        c[k] = a[i];
        i++;
        k++;
      } else {
        c[k] = b[j];
        j++;
        k++;
      }
    }

    if (i == a.length) {
      // now take element from b only
      while (j < b.length) {
        c[k] = b[j];
        i++;
        j++;
      }
    }

    if (j == b.length) {
      while (i < a.length) {
        c[k] = a[i];
        i++;
        j++;
      }
    }
    for (int ele : c) {
      System.out.print(ele + " ");
    }

  }
}
