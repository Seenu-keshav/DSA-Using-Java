// Check if array can be partitioned into k subsets with equal sum.

package Arrays;
import java.util.Scanner;
public class Ques41 {
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

        boolean canPartition = canPartitionKSubsets(arr, k);
        if (canPartition) {
            System.out.println("The array can be partitioned into " + k + " subsets with equal sum.");
        } else {
            System.out.println("The array cannot be partitioned into " + k + " subsets with equal sum.");
        }

        sc.close();
    }

    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % k != 0) {
            return false;
        }

        int targetSum = totalSum / k;
        boolean[] visited = new boolean[arr.length];
        return canPartition(arr, visited, k, 0, 0, targetSum);
    }

    private static boolean canPartition(int[] arr, boolean[] visited, int k, int currentSum, int startIndex, int targetSum) {
        if (k == 1) {
            return true;
        }

        if (currentSum == targetSum) {
            return canPartition(arr, visited, k - 1, 0, 0, targetSum);
        }

        for (int i = startIndex; i < arr.length; i++) {
            if (!visited[i] && currentSum + arr[i] <= targetSum) {
                visited[i] = true;
                if (canPartition(arr, visited, k, currentSum + arr[i], i + 1, targetSum)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }
}
