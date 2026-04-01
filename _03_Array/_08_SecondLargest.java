public class _08_SecondLargest {
  public static void main(String[] args) {
    int arr[] = { -10, 20, 320, 90, 20 };
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max && arr[i] > secMax) {
        secMax = max;
        max = arr[i];
      } else if (arr[i] > secMax && arr[i] < max) {
        secMax = arr[i];
      }
    }
    System.out.println("Max : " + max);
    System.out.println("Second max :" + secMax);
  }
}
