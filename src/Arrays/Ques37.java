// Search in rotated sorted array (with distinct elements).

package Arrays;
import java.util.Scanner;
public class Ques37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();

        int targetIndex = searchInRotatedSortedArray(arr, target);
        if (targetIndex != -1) {
            System.out.println("The target " + target + " is found at index: " + targetIndex);
        } else {
            System.out.println("The target " + target + " is not found in the array.");
        }

        sc.close();
    }

    public static int searchInRotatedSortedArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Determine which side is properly sorted
            if (arr[left] <= arr[mid]) { // Left side is sorted
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // Target is in the left side
                } else {
                    left = mid + 1; // Target is in the right side
                }
            } else { // Right side is sorted
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // Target is in the right side
                } else {
                    right = mid - 1; // Target is in the left side
                }
            }
        }

        return -1; // Target not found
    }
}
