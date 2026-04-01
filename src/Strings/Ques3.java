// Check if two strings are anagrams.

package Strings;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }

    public static boolean checkAnagram(String str1, String str2) {
        String cleanedStr1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedStr1.length() != cleanedStr2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII character set

        for (char c : cleanedStr1.toCharArray()) {
            charCount[c]++;
        }

        for (char c : cleanedStr2.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
