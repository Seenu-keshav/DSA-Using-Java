// Count occurrences of a pattern in a text (naive and KMP).

package Strings;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        System.out.print("Enter the pattern to search: ");
        String pattern = sc.nextLine();

        int naiveCount = countOccurrencesNaive(text, pattern);
        int kmpCount = countOccurrencesKMP(text, pattern);

        System.out.println("Occurrences (Naive): " + naiveCount);
        System.out.println("Occurrences (KMP): " + kmpCount);
        sc.close();
    }

    public static int countOccurrencesNaive(String text, String pattern) {
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrencesKMP(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        int i = 0, j = 0;
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                count++;
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }    
            }
        }
        return lps;
    }
}
