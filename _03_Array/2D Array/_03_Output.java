public class _03_Output {
  public static void main(String args[]) {
    int arr[][] = new int[4][2];
    arr[0][0] = 20;
    arr[0][1] = 20;
    arr[1][0] = 20;
    arr[1][1] = 20;
    arr[2][0] = 20;
    arr[2][1] = 20;
    arr[3][0] = 20;
    arr[3][1] = 20;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}
