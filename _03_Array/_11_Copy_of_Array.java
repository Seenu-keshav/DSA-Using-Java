
import java.util.Arrays;

public class _11_Copy_of_Array {
  public static void main(String[] args) {
    int nums[] = { 30, 40, 20, 90 };
    for (int elem : nums) {
      System.out.println(elem);
    }
    System.out.println();
    // int arr[] = nums;// shallow copy
    // arr[0] = 70;
    // System.out.println(nums[0]);

    // deep copy -- two ways
    // first way of deep copy
    int[] brr = Arrays.copyOf(nums, nums.length);
    brr[0] = 70;
    System.out.println(nums[0]);
    // second way of deep copy
    int crr[] = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      crr[i] = nums[i];
    }
    // for (int elem : arr) {
    // System.out.println(elem);
    // }

  }
}
