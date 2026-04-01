// Remove duplicates from a sorted array (in-place) and return new length.

package Arrays;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length of the array: " + newLength);

        sc.close();
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }

        return index;
    }
    
}
