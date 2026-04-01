
import java.util.Scanner;

public class _17_MazePath {
  static int maze(int row, int column, int m, int n) {
    if (row == m || column == n)
      return 1;
    // if(row==m&&column==n) return 1;
    // if(row>1&&column>n)return 0;
    int rightways = maze(row, column + 1, m, n);
    int downways = maze(row + 1, column, m, n);
    return rightways + downways;

  }

  static int maze2(int m, int n) {
    if (m == 1 || n == 1)
      return 1;

    int rightways = maze2(m, n - 1);
    int downways = maze2(m - 1, n);
    return rightways + downways;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter m : ");
    int m = sc.nextInt();
    System.out.println(maze(1, 1, m, n));
    System.out.println(maze2(m, n));
  }
}
