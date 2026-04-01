// Count number of inversions in an array (using merge sort)

package Arrays;

import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int inversionCount = countInversions(arr);
        System.out.println("The number of inversions in the array is: " + inversionCount);

        sc.close();
    }

    // Function to count inversions
    public static int countInversions(int[] arr) {
        if (arr.length == 0) return 0;
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    // Recursive merge sort function
    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left half
            invCount += mergeSortAndCount(arr, left, mid);

            // Count inversions in right half
            invCount += mergeSortAndCount(arr, mid + 1, right);

            // Count split inversions
            invCount += mergeAndCount(arr, left, mid, right);
        }
        return invCount;
    }

    // Merge two sorted halves and count inversions
    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < rightArr.length; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        int invCount = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                invCount += (mid + 1) - (left + i); // All remaining elements in leftArr are inversions
            }
        }

        // Copy remaining elements
        while (i < leftArr.length)
            arr[k++] = leftArr[i++];
        while (j < rightArr.length)
            arr[k++] = rightArr[j++];

        return invCount;
    }
}
