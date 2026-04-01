// Given an array, find if there exists a pair with given sum (two-sum — sorted/unsorted variants).

package Arrays;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = hasPairWithSum(arr, target);

        if (found) {
            System.out.println("✅ There exists a pair with the given sum.");
        } else {
            System.out.println("❌ No pair with the given sum exists.");
        }

        sc.close();
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> complements = new HashSet<>();

        for (int num : arr) {
            if (complements.contains(target - num)) {
                return true; 
            }
            complements.add(num);
        }

        return false; 
    }
}
