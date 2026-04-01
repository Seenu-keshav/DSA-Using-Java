// Given rotated sorted array, find pivot (index of rotation)

package Arrays;
import java.util.Scanner;
public class Ques36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pivotIndex = findPivot(arr);
        if (pivotIndex != -1) {
            System.out.println("The pivot index (index of rotation) is: " + pivotIndex);
        } else {
            System.out.println("The array is not rotated.");
        }

        sc.close();
    }

    public static int findPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        if (arr[left] < arr[right]) {
            return -1; // Array is not rotated
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < right && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > left && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Pivot not found
    }
}
