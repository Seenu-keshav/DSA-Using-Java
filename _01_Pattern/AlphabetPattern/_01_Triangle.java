import java.util.Scanner;

public class _01_Triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (65 + i));
      }
      System.out.println();
    }
  }
}
