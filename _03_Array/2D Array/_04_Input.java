
import java.util.Scanner;

public class _04_Input {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int arr[][] = new int[2][4];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println("");
    }
    int n = arr.length;// number of rows
    int m = arr[0].length;// number of columns

  }
}
