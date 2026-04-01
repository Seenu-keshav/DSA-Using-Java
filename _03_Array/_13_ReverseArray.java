public class _13_ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
    for (Integer num : arr) {
      System.out.print(num + " ");
    }
    int n = arr.length;
    // for (int i = 0; i < n / 2; i++) {

    // int temp = arr[i];
    // arr[i] = arr[n - 1 - i];
    // arr[n - 1 - i] = arr[i];
    // }
    int i = 0;
    int j = n - 1;
    while (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    System.out.println();
    for (Integer num : arr) {
      System.out.print(num + " ");
    }
  }
}
