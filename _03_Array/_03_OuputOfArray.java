public class _03_OuputOfArray {
  public static void main(String[] args) {
    int[] arr = new int[7];
    arr[0] = 50;
    arr[1] = 80;
    arr[2] = 90;
    arr[3] = 20;
    arr[4] = 30;
    arr[5] = 40;
    arr[6] = 50;
    arr[2] = 10;

    for (int idx = 0; idx < arr.length; idx++) {
      int elem = arr[idx];
      System.out.println(elem);
    }
  }
}
