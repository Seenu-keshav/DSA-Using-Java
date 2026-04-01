// Longest decreasing subsequence.

package Arrays;
import java.util.Scanner;
public class Ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ldsLength = longestDecreasingSubsequence(arr);
        System.out.println("The length of the longest decreasing subsequence is: " + ldsLength);

        sc.close();
    }

    public static int longestDecreasingSubsequence(int[] arr) {
        if (arr.length == 0) return 0;

        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
