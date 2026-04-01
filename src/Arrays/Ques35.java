// Reorder array into alternating positive and negative elements.

package Arrays;
import java.util.Scanner;
public class Ques35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rearrangedArray = rearrangeArray(arr);
        System.out.println("The rearranged array is:");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : arr) {
            if (num >= 0) {
                if (posIndex < n) {
                    result[posIndex] = num;
                    posIndex += 2;
                }
            } else {
                if (negIndex < n) {
                    result[negIndex] = num;
                    negIndex += 2;
                }
            }
        }

        return result;
    }
}
