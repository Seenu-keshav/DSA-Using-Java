// Longest increasing subsequence (LIS) — O(n log n) method.

package Arrays;
import java.util.Scanner;
public class Ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lisLength = longestIncreasingSubsequence(arr);
        System.out.println("The length of the longest increasing subsequence is: " + lisLength);

        sc.close();
    }

    public static int longestIncreasingSubsequence(int[] arr) {
        if (arr.length == 0) return 0;

        int[] tails = new int[arr.length];
        int size = 0;

        for (int num : arr) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            tails[left] = num;
            if (left == size) size++;
        }

        return size;
    }
}
