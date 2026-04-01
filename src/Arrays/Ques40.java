// Partition array into two subsets with minimum difference (subset sum variant).

package Arrays;
import java.util.Scanner;
public class Ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDifference = findMinSubsetSumDifference(arr);
        System.out.println("The minimum difference between two subsets is: " + minDifference);

        sc.close();
    }

    public static int findMinSubsetSumDifference(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        boolean[][] dp = new boolean[arr.length + 1][totalSum / 2 + 1];

        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= totalSum / 2; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = 0;
        for (int j = totalSum / 2; j >= 0; j--) {
            if (dp[arr.length][j]) {
                sum1 = j;
                break;
            }
        }

        int sum2 = totalSum - sum1;
        return Math.abs(sum2 - sum1);
    }
}
