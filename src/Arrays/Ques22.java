// Container with most water.

package Arrays;
import java.util.Scanner;
public class Ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter " + n + " elements for the heights array:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxArea = maxWaterContainer(heights);
        System.out.println("The maximum water that can be contained is: " + maxArea);

        sc.close();
    }

    public static int maxWaterContainer(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
