// Given an array, find the length of the longest subarray with sum = k.
package Arrays;
import java.util.Scanner;
public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum k: ");
        int k = sc.nextInt();

        int maxLength = longestSubarrayWithSumK(arr, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + maxLength);

        sc.close();
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int maxLength = 0;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum == k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }
}
