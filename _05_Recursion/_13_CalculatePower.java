import java.util.Scanner;

public class _13_CalculatePower {
  public static int pow(int a, int b) {

    if (b == 0)
      return 1;
    return a * pow(a, b - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base : ");
    int a = sc.nextInt();
    System.out.println("Enter power : ");
    int b = sc.nextInt();
    System.out.println(pow(a, b));
  }

}
