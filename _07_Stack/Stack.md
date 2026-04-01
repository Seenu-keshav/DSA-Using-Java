# Stack
- Stack is a linear data structure that follows LIFO (Last In First Out) Principle, the last element inserted is the first to be popped out. It means both insertion and deletion operations happen at one end only.

# LIFO(Last In First Out) Principle
The LIFO principle means that the last element added to a stack is the first one to be removed.

New elements are always pushed on top.
Removal (pop) also happens only from the top.
This ensures a strict order: last in → first out.
# Real-world examples of LIFO:

Stack of plates – The last plate placed on top is the first one you pick up.
Stack of books – Books are added and removed from the top, so the last book placed is the first one taken.
Basic Terminologies of Stack
Top: The position of the most recently inserted element. Insertions (push) and deletions (pop) are always performed at the top.
Size: Refers to the current number of elements present in the stack.
# Types of Stack:
1. Fixed Size Stack
A fixed size stack has a predefined capacity.
Once it becomes full, no more elements can be added (this causes overflow).
If the stack is empty and we try to remove an element, it causes underflow.
Typically implemented using a static array.
Example: Declaring a stack of size 10 using an array.

2. Dynamic Size Stack
A dynamic size stack can grow and shrink automatically as needed.
If the stack is full, its capacity expands to allow more elements.
As elements are removed, memory usage can shrink as well.
Can be implemented using:
-> Linked List → grows/shrinks naturally.
-> Dynamic Array (like vector in C++ or ArrayList in Java) → resizes automatically.
Example: Stack implementation using linked list or resizable array.

Note: We generally use dynamic stacks in practice, as they can grow or shrink as needed without overflow issues.

# Common Operations on Stack:
In order to make manipulations in a stack, there are certain operations provided to us.

push() to insert an element into the stack.
pop() to remove an element from the stack.
top() Returns the top element of the stack.
isEmpty() returns true if stack is empty else false.
size() returns the size of the stack.


# Stack Implementation
```
class myStack {

    // array to store elements
    private int[] arr;

    // maximum size of stack
    private int capacity;

    // index of top element
    private int top;

    // constructor
    public myStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    // push operation
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // peek (or top) operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        myStack st = new myStack(4);

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                            (st.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " +
                            (st.isFull() ? "Yes" : "No"));
    }
}
```

# Stack implementation using Linked List
```
// Node structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// Stack implementation using linked list
class myStack {
    Node top;

    // To Store current size of stack
    int count;

    myStack() {
        // initially stack is empty
        top = null;
        count = 0;
    }

    // push operation
    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;

        count++;
    }

    // pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        Node temp = top;
        top = top.next;
        int val = temp.data;

        count--;
        return val;
    }

    // peek operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // size of stack
    int size() {
        return count;
    }

    public static void main(String[] args) {
        myStack st = new myStack();

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));

        // checking current size
        System.out.println("Current size: " + st.size());
    }
}

```

1. Valid Parentheses
solution explanation

step 1 : Create an empty stack.
step 2 :Traverse each character in the string.
step 3 : If the character is an opening bracket (, [, {
→ Push its corresponding closing bracket ), ], } into the stack.
step 4 : If the character is a closing bracket:
If the stack is empty → return false.
Pop the top element from the stack and compare with current character.
If they don’t match → return false.

step 5 : After traversing the string:
If the stack is empty → return true.
Otherwise → return false.

```
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }else if(c=='['){
                st.push(']');
            }else if(c=='{'){
                st.push('}');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
```
2.  
```
```




