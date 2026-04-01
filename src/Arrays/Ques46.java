// Given array of integers, find longest arithmetic progression subsequence length

package Arrays;

import java.util.*;

public class Ques46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Find longest arithmetic progression subsequence length
        int longestLength = longestArithmeticProgression(arr);

        // Step 3: Print result
        System.out.println("The length of the longest arithmetic progression subsequence is: " + longestLength);

        sc.close();
    }

    // Function to find LAP length using dynamic programming
    public static int longestArithmeticProgression(int[] arr) {
        int n = arr.length;
        if (n <= 2) return n;

        int maxLength = 2;

        // Step 4: Build DP table
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> dp = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                int len = dp.getOrDefault(diff, 1) + 1;
                dp.put(diff, len);
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }
}

