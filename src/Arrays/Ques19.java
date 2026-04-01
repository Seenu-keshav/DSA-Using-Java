// Find smallest missing positive integer in O(n) time and O(1) extra space.

package Arrays;
import java.util.Scanner;
public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missingPositive = firstMissingPositive(arr);
        System.out.println("The smallest missing positive integer is: " + missingPositive);

        sc.close();
    }

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Replace negative numbers, zeros, and numbers larger than n with n+1
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Step 2: Use index as a hash to record the presence of numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Step 3: Find the first index which has a positive value
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
