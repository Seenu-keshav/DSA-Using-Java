// Find all unique triplets that sum to zero (3-sum).

package Arrays;
import java.util.Scanner;
public class Ques42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The unique triplets that sum to zero are:");
        findUniqueTriplets(arr);

        sc.close();
    }

    public static void findUniqueTriplets(int[] arr) {
        java.util.Arrays.sort(arr);
        java.util.Set<java.util.List<Integer>> triplets = new java.util.HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    triplets.add(java.util.Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        for (java.util.List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
