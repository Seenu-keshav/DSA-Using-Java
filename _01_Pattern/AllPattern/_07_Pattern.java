
import java.util.Scanner;

public class _07_Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i % 2 == 0)
          System.out.print((char) (96 + i) + " ");
        else
          System.out.print((char) (64 + i) + " ");
      }
      System.out.println();
    }
  }
}
