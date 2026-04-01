// 4-sum problem: find quadruplets summing to target.

package Arrays;
import java.util.Scanner;
public class Ques43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.println("Quadruplets summing to " + target + ":");
        findQuadruplets(arr, target);

        sc.close();
    }

    public static void findQuadruplets(int[] arr, int target) {
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + ", " + arr[l] + "]");
                            found = true;
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No quadruplets found.");
        }
    }
}
