// Longest subarray with sum divisible by k.

package Arrays;
import java.util.Scanner;
public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int maxLength = longestSubarrayWithSumDivisibleByK(arr, k);
        System.out.println("The length of the longest subarray with sum divisible by " + k + " is: " + maxLength);

        sc.close();
    }

    public static int longestSubarrayWithSumDivisibleByK(int[] arr, int k) {
        int maxLength = 0;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum % k == 0) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }
}
