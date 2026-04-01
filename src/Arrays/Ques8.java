// Find the median of two sorted arrays of equal size.

package Arrays;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements for the first sorted array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements for the second sorted array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        double median = findMedianSortedArrays(arr1, arr2);

        System.out.println("Median of the two sorted arrays: " + median);

        sc.close();
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] merged = new int[2 * n];

        int i = 0, j = 0, k = 0;

        while (i < n && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        return (merged[n - 1] + merged[n]) / 2.0;
    }
    
}
