// Minimum insertions to make a string palindrome.

package Strings;
import java.util.Scanner;
public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int minInsertions = minInsertionsToPalindrome(input);
        System.out.println("Minimum insertions to make the string a palindrome: " + minInsertions);
        sc.close();
    }

    public static int minInsertionsToPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[0][n - 1];
    }
}
