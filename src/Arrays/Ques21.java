// Given an array of heights, find trapped rainwater (trapping rain water problem).

package Arrays;
import java.util.Scanner;
public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter " + n + " elements for the heights array:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int trappedWater = trapRainWater(heights);
        System.out.println("The total trapped rainwater is: " + trappedWater);

        sc.close();
    }

    public static int trapRainWater(int[] heights) {
        int n = heights.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return totalWater;
    }
}
