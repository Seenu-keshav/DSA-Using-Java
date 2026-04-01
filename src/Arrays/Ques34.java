// Find the smallest subarray with sum ≥ s.

package Arrays;
import java.util.Scanner;

public class Ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum (s): ");
        int s = sc.nextInt();

        int minLength = smallestSubarrayWithSumAtLeastS(arr, s);
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray found with sum ≥ " + s);
        } else {
            System.out.println("The length of the smallest subarray with sum ≥ " + s + " is: " + minLength);
        }

        sc.close();
    }

    public static int smallestSubarrayWithSumAtLeastS(int[] arr, int s) {
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum >= s) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start];
                start++;
            }
        }

        return minLength;
    }
}