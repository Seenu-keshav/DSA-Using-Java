// Find element count greater than average.

package Arrays;
import java.util.Scanner;
public class Ques38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = countElementsGreaterThanAverage(arr);
        System.out.println("The number of elements greater than the average is: " + count);

        sc.close();
    }

    public static int countElementsGreaterThanAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;

        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }

        return count;
    }
}
