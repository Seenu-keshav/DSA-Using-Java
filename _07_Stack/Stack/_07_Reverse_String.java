
import java.util.Stack;

public class _07_Reverse_String {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
