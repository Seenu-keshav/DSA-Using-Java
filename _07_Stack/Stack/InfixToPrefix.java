// this is converting infix to postfix
// import java.util.Stack;

// public class InfixToPrefix {

//     static int prec(char ch) {
//         switch (ch) {
//             case '+':
//             case '-':
//                 return 1;

//             case '*':
//             case '/':
//                 return 2;

//             case '^':
//                 return 3;

//         }
//         return -1;
//     }

// // Function to convert infix to prefix
//     static String infixToprefix(String exp) {
//       // Creating a stack and a string to store the prefix expression
//         String result = new String("");
//         Stack<Character> stack = new Stack<>();


//         // Traversing the expression from left to right
//         for (int i = 0; i < exp.length(); ++i) {
//             char ch = exp.charAt(i);
// // Check The digit 
//             if (Character.isLetterOrDigit(ch)) {
//                 result += ch;

//                 // Push the operator to the stack
//             } else if (ch == '(') {
//                 stack.push(ch);

//                 // Pop the operator from the stack and append it to the result
//             } else if (ch == ')') {

//               //Stack Empty or top of stack is not '('
//                 while (!stack.isEmpty() && stack.peek() != '(') {
//                     result += stack.pop();
//                 }
//                 stack.pop(); 
//             } else {
//               // Pop all operators with precedence less than the current operator from the stack and append them to the result
//                 while(!stack.isEmpty() && prec(ch) <= prec(stack.peek())) {
//                     result += stack.pop();
//                 }
//                 stack.push(ch);
//             }
//         }

//         // ✅ This should be outside the loop
//         while (!stack.isEmpty()) {
//             if (stack.peek() == '(') {
//                 return "Invalid Expression";
//             }
//             result += stack.pop();
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         String exp = "(p+q)*(m-n)";
//         System.out.println("Infix expression: " + exp);
//         System.out.println("Prefix expression: " + infixToprefix(exp));
//     }
// }


// this is converting infix to prefix

// 1.reverse the infix expression

// 2. infix To postfix

//3.reverse that answer
 public class InfixToPrefix {
    public static String infixToprefix(String exp) {
    return "";
    }




public static void main(String[] args) {
    
}

}