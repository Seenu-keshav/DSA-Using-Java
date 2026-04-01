public class _07_MinimumNumber {
  public static void main(String[] args) {
    int arr[] = { 10, 8, 1, 4, 6, 23 };
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println(min);
  }
}
