
import java.util.Stack;

class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int val) {
        while (input.empty() == false) {
            output.push(input.peek());
            input.pop();
        }

        System.out.println("The Element Pushed is" + val);
        input.push(val);

        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop() {
        if (input.empty()) {
            System.out.println("Queue is Empty");
        }

        int val = input.peek();
        input.pop();
        return val;

    }

    public int peek() {
        if (input.empty()) {
            System.out.println("Queue is Empty");

        }
        return input.peek();
    }

    int size() {
        return input.size();
    }

}

public class QueueUsingStack1 {

    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
