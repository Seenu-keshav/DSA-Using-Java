// Dutch National Flag / sort array of 0s,1s,2s.

package Arrays;
import java.util.Scanner;
public class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array (only 0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortColors(arr);
        System.out.println("The sorted array is:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }

    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
