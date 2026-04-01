
class stack {

    int size = 1000;
    int top = -1;
    int st[] = new int[size];

    void push(int x) {
        if (top >= size) {
            System.out.println("Stack is full");
        }
        top++;
        st[top] = x;
    }

    int pop() {
        if (top < 0) {
            return -1;
        }
        int x = st[top];
        top--;
        return x;

    }

    int top() {
        return st[top];
    }

    int size() {
        return top + 1;
    }

}

public class _01_StackUsingArray {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top element" + s.top());
        System.out.println("Size of stack" + s.size());
        System.out.println(s.pop());
        System.out.println("Size of stack" + s.size());
    }
}
