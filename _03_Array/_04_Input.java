
import java.util.Scanner;

public class _04_Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    for (int idx = 0; idx < arr.length; idx++) {
      int elem = sc.nextInt();
      arr[idx] = elem;
    }
    for (int idx = 0; idx < arr.length; idx++) {
      System.out.println(arr[idx]);
    }
  }
}
