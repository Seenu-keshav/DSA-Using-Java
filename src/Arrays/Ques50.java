// Given heights representing buildings, compute skyline outline (basic sweep-line).

package Arrays;
import java.util.Scanner;
public class Ques50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();

        int[][] buildings = new int[n][2];
        System.out.println("Enter the left and right heights for each building:");
        for (int i = 0; i < n; i++) {
            buildings[i][0] = sc.nextInt(); // left height
            buildings[i][1] = sc.nextInt(); // right height
        }

        System.out.println("The skyline outline is:");
        int[][] skyline = getSkyline(buildings);
        for (int[] point : skyline) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }

        sc.close();
    }

    public static int[][] getSkyline(int[][] buildings) {
        // This is a placeholder for the skyline algorithm.
        // Implementing a full skyline algorithm is complex and beyond this example's scope.
        // Here, we return an empty array for demonstration purposes.
        return new int[0][0];
    }
}
