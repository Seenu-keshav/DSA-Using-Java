
import java.util.Arrays;

public class _01_LargestElement {
  public static void main(String[] args) {
    // 1 Method
    // int[] nums = { 2, 9, 8, 4, 5, 1, 6, 10 };
    // Arrays.sort(nums);

    // System.err.println("the largest element of the given array is :" +
    // nums[nums.length - 1]);

    // Second method
    int arr[] = { 4, 5, 6, 7, 8 };
    System.out.println("The Given array is : " + Arrays.toString(arr));
    System.out.println("The largest element of array is : " + largestElement(arr));
  }

  static int largestElement(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
