// Previous permutation of array

package Arrays;
import java.util.Scanner;
public class Ques31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        previousPermutation(arr);
        System.out.println("The previous permutation is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void previousPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] >= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        reverse(arr, i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
