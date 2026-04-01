public class _06_Maximum_Element {
  public static void main(String[] args) {
    int arr[][] = { { 1, 5, 6 }, { 2, -9, 3 }, { 5, 0, 3 } };
    int mx = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        mx = Math.max(mx, arr[i][j]);
      }
    }
    System.out.println(mx);
  }
}
