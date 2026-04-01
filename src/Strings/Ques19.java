// Decode string (e.g., "3[a]2[bc]").

package Strings;
import java.util.*;

public class Ques19 {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // Build the number
            } 
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = "";
                k = 0;
            } 
            else if (ch == ']') {
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int currentK = countStack.pop();

                for (int i = 0; i < currentK; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString.toString();
            } 
            else {
                currentString += ch;
            }
        }
        return currentString;
    }
}
