// Rearrange array to form the next greater number (digits as array).

package Arrays;
import java.util.Scanner;
public class Ques48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter " + n + " digits for the array:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        boolean hasNext = nextGreaterNumber(digits);
        if (hasNext) {
            System.out.println("The next greater number is:");
            for (int digit : digits) {
                System.out.print(digit + " ");
            }
        } else {
            System.out.println("No greater number can be formed.");
        }

        sc.close();
    }

    public static boolean nextGreaterNumber(int[] digits) {
        int n = digits.length;
        int i = n - 2;

        // Find the first decreasing element from the end
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such element is found, return false
        if (i < 0) {
            return false;
        }

        // Find the smallest element on right side of 'i' which is larger than digits[i]
        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap elements at i and j
        swap(digits, i, j);

        // Reverse the elements after index i
        reverse(digits, i + 1, n - 1);

        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
