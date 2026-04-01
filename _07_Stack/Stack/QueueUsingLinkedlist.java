
class QueueNode {

    int val;
    QueueNode next;

    public QueueNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Queue {

    QueueNode Front = null, Rear = null;
    int size;

    boolean Empty() {
        return Front == null;
    }

    int peek() {
        if (Empty()) {
            System.err.println("Queue is Empty");
            return -1;
        } else {
            return Front.val;
        }
    }

    void Enqueue(int data) {
        QueueNode Temp;
        Temp = new QueueNode(data);
        if (Temp == null) {
            System.err.println("Null");
        } else {

            if (Front == null) {
                Front = Temp;
                Rear = Temp;
            } else {
                Rear.next = Temp;
                Rear = Temp;

            }

            System.out.println("Value is added " + data);
            size++;
        }
    }

    void Dequeue() {
        if (Front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(Front.val + "Removed From The Queue");
            QueueNode temp = Front;
            Front = Front.next;
            size--;
        }
    }

}

public class QueueUsingLinkedlist {

    public static void main(String args[]) {

    }
}
