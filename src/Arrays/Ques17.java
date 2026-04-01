// Product of array except self (without using division).

package Arrays;
import java.util.Scanner;
public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(arr);
        System.out.println("The product array except self is:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Initialize the result array with 1s
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }
}
