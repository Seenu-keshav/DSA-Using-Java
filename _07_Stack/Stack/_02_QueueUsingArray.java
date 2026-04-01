
class Queue {

    private int arr[];
    private int front, rear, maxSize, currSize;

    public Queue() {
        arr = new int[16];
        front = -1;
        rear = -1;
        currSize = 0;
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        currSize = 0;

    }

    public void push(int newElement) {
        if (currSize == maxSize) {
            System.err.println("Queue is Fulled");
            System.exit(1);
        }

        if (rear == -1) {
            front = 0;
            rear = 0;

        } else {
            rear = (rear + 1) % maxSize;
            arr[rear] = newElement;
            currSize++;
        }
    }

    public int pop() {
        if (front == -1) {
            System.err.println("Queue is Empty");
            System.exit(1);
        }
        int popped = arr[front];
        if (currSize == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }

        currSize--;
        return popped;
    }
    

  





}

public class _02_QueueUsingArray {

    public static void main(String[] args) {

    }
}
