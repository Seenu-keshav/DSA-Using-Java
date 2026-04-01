// Merge two sorted arrays into one sorted array (without using extra space if possible).

package Arrays;
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first sorted array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second sorted array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        mergeSortedArrays(arr1, arr2);

        System.out.println("Merged sorted array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i < n1; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap arr1[i] and arr2[0]
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Move the first element of arr2 to its correct position
                int first = arr2[0];
                int k;
                for (k = 1; k < n2 && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
    
}
