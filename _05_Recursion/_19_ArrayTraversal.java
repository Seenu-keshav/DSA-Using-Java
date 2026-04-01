public class _19_ArrayTraversal {
  public static void print(int[] arr, int i) {
    if (arr.length == i)
      return;
    System.out.println(arr[i]);
    print(arr, i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    print(arr, 0);
  }
}
