
public class StackUsingArray {

    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(3);
        st.push(7);
        System.out.println(st.top());
        System.out.println(st.size());

    }
}

class stack {

    int size = 1000;
    int arr[] = new int[size];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int top() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }
}
