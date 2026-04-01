// Longest substring without repeating characters

package Strings;
import java.util.*;
public class Ques17 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}