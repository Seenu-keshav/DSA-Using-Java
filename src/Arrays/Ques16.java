// Maximum circular subarray sum.

package Arrays;
import java.util.Scanner;
public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCircularSum = maxCircularSubarraySum(arr);
        System.out.println("The maximum circular subarray sum is: " + maxCircularSum);

        sc.close();
    }

    public static int maxCircularSubarraySum(int[] arr) {
        int maxKadane = kadanesAlgorithm(arr);
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int maxInvertedKadane = kadanesAlgorithm(arr);
        int maxCircular = totalSum + maxInvertedKadane;

        return (maxCircular == 0) ? maxKadane : Math.max(maxKadane, maxCircular);
    }

    public static int kadanesAlgorithm(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
