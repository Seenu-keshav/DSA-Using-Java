// Longest palindromic substring (expand-around-center and DP).

package Strings;
import java.util.Scanner;
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String longestPalindromicSubstring = longestPalindromicSubstring(input);
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring);
        sc.close();
    }

    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length
            int len2 = expandAroundCenter(s, i, i + 1); // Even length
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
