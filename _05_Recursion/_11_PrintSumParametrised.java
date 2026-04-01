
import java.util.Scanner;

public class _11_PrintSumParametrised {
  static void printSum(int n, int sum) {
    if (n == 0) {
      System.out.println("Sum = " + sum);
      return;
    }
    printSum(n - 1, sum + n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number n : ");
    int n = sc.nextInt();
    printSum(n, 0);
  }
}
