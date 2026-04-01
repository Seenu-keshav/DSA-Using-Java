// Find duplicates in array where values are in range 1..n using indexing tricks

package Arrays;
import java.util.Scanner;
public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array (values should be in range 1 to " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The duplicate elements in the array are:");
        findDuplicates(arr);

        sc.close();
    }

    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicates: ");
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                System.out.print(Math.abs(arr[i]) + " ");
                foundDuplicate = true;
            } else {
                arr[index] = -arr[index];
            }
        }
        if (!foundDuplicate) {
            System.out.print("No duplicates found");
        }
        System.out.println();
    }
}
