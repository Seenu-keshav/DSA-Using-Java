public class _08_Add_Matrix {
  public static void main(String[] args) {
    int[][] a = { { 1, 9, 2 }, { 3, 7, 4 }, { 8, 5, 6 } };
    int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };
    int n = a.length;
    int m = a[0].length;
    int[][] res = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        res[i][j] = a[i][j] + b[i][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }

  }
}
