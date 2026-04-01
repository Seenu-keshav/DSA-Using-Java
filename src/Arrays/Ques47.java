// Given an array, find maximum product subarray.

package Arrays;
import java.util.Scanner;
public class Ques47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProduct = maxProductSubarray(arr);
        System.out.println("The maximum product subarray is: " + maxProduct);

        sc.close();
    }

    public static int maxProductSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(arr[i], maxSoFar * arr[i]);
            minSoFar = Math.min(arr[i], minSoFar * arr[i]);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
