// Given an array, find length of longest subarray with all distinct elements

package Arrays;
import java.util.Scanner;
public class Ques45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longestLength = longestDistinctSubarray(arr);
        System.out.println("The length of the longest subarray with all distinct elements is: " + longestLength);

        sc.close();
    }

    public static int longestDistinctSubarray(int[] arr) {
        int maxLength = 0;
        int left = 0;
        java.util.Map<Integer, Integer> indexMap = new java.util.HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            if (indexMap.containsKey(arr[right])) {
                left = Math.max(left, indexMap.get(arr[right]) + 1);
            }
            indexMap.put(arr[right], right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
