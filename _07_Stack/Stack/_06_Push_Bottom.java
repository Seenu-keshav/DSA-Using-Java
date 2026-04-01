
import java.util.Stack;

public class _06_Push_Bottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
