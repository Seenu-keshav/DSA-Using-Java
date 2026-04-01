// Longest palindromic subsequence.

package Strings;
import java.util.Scanner;
public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int lpsLength = longestPalindromicSubsequence(input);
        System.out.println("Length of Longest Palindromic Subsequence: " + lpsLength);
        sc.close();
    }

    public static int longestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1; // Single character is a palindrome of length 1
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
