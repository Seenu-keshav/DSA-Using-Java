
public class _02_SecondLargestElement {
  public static void main(String[] args) {
    // 1 Method
    int[] nums = { 2, 9, 8, 4, 5, 1, 6, 10 };
    // Arrays.sort(nums);

    // System.err.println("the largest element of the given array is :" +
    // nums[nums.length - 2]);

    // 2 Method
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max && nums[i] > secMax) {
        secMax = max;
        max = nums[i];
      } else if (nums[i] > secMax && nums[i] < max) {
        secMax = nums[i];
      }
    }
    System.out.println("Largest is :" + max + "Second Largest is :" + secMax);
  }
}
