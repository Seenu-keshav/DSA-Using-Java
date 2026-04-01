public class _09_Transpose {
  public static void main(String[] args) {
    int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
    int n = a.length;
    int m = a[0].length;
    // row wise or column wise printing
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }

    // column wise printing
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
