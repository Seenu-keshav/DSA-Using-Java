// Longest increasing contiguous subarray.

package Arrays;
import java.util.Scanner;
public class Ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longestLength = longestIncreasingContiguousSubarray(arr);
        System.out.println("The length of the longest increasing contiguous subarray is: " + longestLength);

        sc.close();
    }

    public static int longestIncreasingContiguousSubarray(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }
}
