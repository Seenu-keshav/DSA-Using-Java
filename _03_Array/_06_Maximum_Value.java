public class _06_Maximum_Value {
  public static void main(String[] args) {
    int arr[] = { 10, 8, 1, 4, 6, 23 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}
