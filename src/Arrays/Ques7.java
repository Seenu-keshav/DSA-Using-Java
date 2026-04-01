// Given a sorted array, find the index of the first occurrence of a target using binary search.

package Arrays;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();

        int index = firstOccurrence(arr, target);

        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; 
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result; 
    }
    
}
