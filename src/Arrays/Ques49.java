// Given array of intervals, merge overlapping intervals (intervals can be represented as arrays).

package Arrays;
import java.util.Scanner;
public class Ques49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter " + n + " intervals (start and end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] mergedIntervals = mergeIntervals(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        sc.close();
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        java.util.List<int[]> mergedList = new java.util.ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                mergedList.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        mergedList.add(currentInterval);

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
