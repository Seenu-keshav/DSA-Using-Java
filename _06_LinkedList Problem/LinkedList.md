# What is LinkedList ?

- A linked list is a fundamental data structure in computer science. It mainly allows efficient insertion and deletion operations compared to arrays. Like arrays, it is also used to implement other data structures like stack, queue and deque.

- A linked list is a type of linear data structure individual items are not necessarily at contiguous locations. The individual items are called nodes and connected with each other using links.

- A node contains two things first is data and second is a link that connects it with another node.
- The first node is called the head node and we can traverse the whole list using this head and next links.

# Here’s the comparison of Linked List and Arrays

Linked List:

Data Structure: Non-contiguous
Memory Allocation: Typically allocated one by one to individual elements
Insertion/Deletion: Efficient
Access: Sequential
Array:

Data Structure: Contiguous
Memory Allocation: Typically allocated to the whole array
Insertion/Deletion: Inefficient
Access: Random

# Singly LinkedList

- A singly linked list is a fundamental data structure, it consists of nodes where each node contains a data field and a reference to the next node in the linked list. The next of the last node is null, indicating the end of the list. Linked Lists support efficient insertion and deletion operations.

- In a singly linked list, each node consists of two parts: data and a pointer to the next node. This structure allows nodes to be dynamically linked together, forming a chain-like sequence.

```
// Definition of a Node in a singly linked list
public class Node {

    // Data part of the node
    int data;

    // Pointer to the next node in the list
    Node next;

    // Constructor to initialize the node with data
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
```

# Traversing on Singly LinkedList

```
 public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
```

# Insertion In Singly LinkedList

```
 static Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    static Node inserAtEnd(Node head, int x) {

        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
       last.next = newNode;
       return head;
    }
static Node insertPos(Node head, int pos, int val) {

        if (pos < 1)
            return head;
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
       if (curr == null)
            return head;

        Node newNode = new Node(val);

         newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

```

# Deletion in Single LinkedList

```
 static Node deleteHead(Node head) {
        if (head == null)
            return null;
         Node temp = head;
         head = head.next;
         temp = null;

        return head;
    }

     static Node removeLastNode(Node head) {
        if (head == null) {
            return null;
        }
       if (head.next == null) {
            return null;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;

        return head;
    }

     static Node deleteNode(Node head, int position) {
        Node temp = head;

        if (position == 1) {
            head = temp.next;
            return head;
        }

        Node prev = null;
        for (int i = 1; i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

       prev.next = temp.next;

        return head;
    }
```

# Search in single LinkedList

```
static boolean searchKey(Node head, int key) {

        Node curr = head;
        while (curr != null) {
        if (curr.data == key)
                return true;
            curr = curr.next;
        }
       return false;
    }
```

# Doubly LinkedList

- A doubly linked list is a more complex data structure than a singly linked list, but it offers several advantages. The main advantage of a doubly linked list is that it allows for efficient traversal of the list in both directions. This is because each node in the list contains a pointer to the previous node and a pointer to the next node. This allows for quick and easy insertion and deletion of nodes from the list, as well as efficient traversal of the list in both directions

- In a data structure, a doubly linked list is represented using nodes that have three fields:

- Data
- A pointer to the next node (next)
- A pointer to the previous node (prev)

```
class Node {
    int data;
    Node prev;
    Node next;

    Node(int value) {
        data = value;
        prev = null;
        next = null;
    }
}

class GfG {
    public static void main(String[] args) {
        // Create the first node (head of the list)
        Node head = new Node(10);

        // Create and link the second node
        head.next = new Node(20);
        head.next.prev = head;

        // Create and link the third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        // Create and link the fourth node
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        // Traverse the list forward and print elements
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }
}
```

# Traversal

```
static void forwardTraversal(Node head) {
        Node curr = head;

        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.next;
        }

        System.out.println();
    }
```

# Insertion In Doubly LinkedList

```
 public static Node insertAtFront(Node head, int newData) {

        Node newNode = new Node(newData);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public static Node insertEnd(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;

            newNode.prev = curr;
        }

        return head;
    }

static Node insertAtPos(Node head, int pos, int new_data) {
        Node new_node = new Node(new_data);

        if (pos == 1) {
            new_node.next = head;

               if (head != null)
                head.prev = new_node;
            head = new_node;
            return head;
        }

        Node curr = head;
         for (int i = 1; i < pos - 1 && curr != null; ++i) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }
       new_node.prev = curr;
       new_node.next = curr.next;

        curr.next = new_node;

        if (new_node.next != null)
            new_node.next.prev = new_node;

        return head;
    }

```
