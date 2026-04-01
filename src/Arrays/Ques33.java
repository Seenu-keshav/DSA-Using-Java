// Subarray with given product less than k — count.

package Arrays;
import java.util.Scanner;
public class Ques33 {
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

        int count = countSubarraysWithProductLessThanK(arr, k);
        System.out.println("The number of subarrays with product less than " + k + " is: " + count);

        sc.close();
    }

    public static int countSubarraysWithProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];

            while (product >= k && left <= right) {
                product /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
