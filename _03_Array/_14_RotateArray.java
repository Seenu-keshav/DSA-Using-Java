public class _14_RotateArray {
  public static void reverse(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j--;
      i++;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
    int k = 9;
    int n = arr.length;
    k = k % n;
    
    reverse(arr, 0, n - k - 1);
    reverse(arr, n - k, n - 1);
    reverse(arr, 0, n - 1);

    for (Integer ele : arr) {
      System.out.println(ele);
    }
  }

}
