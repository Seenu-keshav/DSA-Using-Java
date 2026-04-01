class NumArray {
  int arr[];

  public NumArray(int[] nums) {
    arr = nums;
    for (int i = 1; i < arr.length; i++) {
      arr[i] += arr[i - 1];
    }
  }

  public int sumRange(int left, int right) {
    int leftSum = 0;
    if (left > 0)
      leftSum = arr[left - 1];
    int rightSum = arr[right];
    return rightSum - leftSum;
  }
}

public class _02_RangeSumQuery {

}
