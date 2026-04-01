
import java.util.Stack;

public class StackImpl {

    static int prec(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    static String InfixToPrefix(String str) {

        String result = new String("");
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
                   // Character 
            if (Character.isLetterOrDigit(c)) {
                result += c;
                // opening bracket
            } else if (c == '(') {
                st.push(c);
                // closing bracket
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += (st.pop());
                }
                st.pop();
                // operator
            } else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result += st.pop();
                }
                st.push(c);
            }
        }
              //poping the element
        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "Invalid Expression";
            }
            result += st.pop();

        }

        return result;

    }

    public static void main(String args[]) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + InfixToPrefix(exp));
    }
}
