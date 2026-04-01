public class _07_Sum_Of_Matrix {
  public static void main(String[] args) {
    int arr[][] = { { 1, 5, 6 }, { 2, -9, 3 }, { 5, 0, 3 } };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        sum += arr[i][j];
      }
    }
    System.out.println(sum);
  }
}
