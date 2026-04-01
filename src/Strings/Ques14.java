// Longest repeating substring.

package Strings;
import java.util.Scanner;   
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int lrsLength = longestRepeatingSubstring(input);
        System.out.println("Length of Longest Repeating Substring: " + lrsLength);
        sc.close();
    }

    public static int longestRepeatingSubstring(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        int maxLength = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }
}
