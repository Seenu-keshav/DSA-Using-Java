
import java.util.Scanner;

public class _01_Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
