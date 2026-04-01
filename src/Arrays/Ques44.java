// Smallest window in string that contains all characters of another string (sliding window variant for
// arrays of chars).

package Arrays;
import java.util.Scanner;
public class Ques44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the pattern string: ");
        String pattern = sc.nextLine();

        String result = findSmallestWindow(str, pattern);
        if (result.isEmpty()) {
            System.out.println("No such window exists.");
        } else {
            System.out.println("The smallest window containing all characters of the pattern is: " + result);
        }

        sc.close();
    }

    public static String findSmallestWindow(String str, String pattern) {
        int[] charCount = new int[256];
        for (char c : pattern.toCharArray()) {
            charCount[c]++;
        }

        int start = 0, startIndex = -1, minLength = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            charCount[endChar]--;

            if (charCount[endChar] >= 0) {
                count++;
            }

            while (count == pattern.length()) {
                if (minLength > end - start + 1) {
                    minLength = end - start + 1;
                    startIndex = start;
                }

                char startChar = str.charAt(start);
                charCount[startChar]++;
                if (charCount[startChar] > 0) {
                    count--;
                }
                start++;
            }
        }

        return (startIndex == -1) ? "" : str.substring(startIndex, startIndex + minLength);
    }
}
