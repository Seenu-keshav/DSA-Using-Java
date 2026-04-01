// Maximize sum of i*arr[i] by rotating array.

package Arrays;
import java.util.Scanner;
public class Ques39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = maximizeSumByRotatingArray(arr);
        System.out.println("The maximum sum of i*arr[i] after rotations is: " + maxSum);

        sc.close();
    }

    public static int maximizeSumByRotatingArray(int[] arr) {
        int n = arr.length;
        int arrSum = 0;
        int currVal = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        for (int j = 1; j < n; j++) {
            currVal = currVal + arrSum - n * arr[n - j];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }
}
