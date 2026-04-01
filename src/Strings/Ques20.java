// Implement run-length encoding and decoding.

package Strings;
import java.util.*;

public class Ques20 {

    // Encode function
    public static String encode(String s) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        return encoded.toString();
    }

    // Decode function
    public static String decode(String s) {
        StringBuilder decoded = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            int count = 0;

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }

            char ch = s.charAt(i);
            for (int j = 0; j < count; j++) {
                decoded.append(ch);
            }
            i++;
        }
        return decoded.toString();
    }
    
}
