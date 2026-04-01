class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class _01_ListNode {
  public static void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void displayRecursively(Node head) {
    if (head == null)
      return;
    System.out.println(head.data);
    displayRecursively(head.next);
  }

  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    // System.out.println(a.data);
    // System.out.println(b.data);
    // System.out.println(c.data);
    // System.out.println(d.data);
    // System.out.println(e.data);

    // System.out.println(a.data);
    // System.out.println(a.next.data);
    // System.out.println(a.next.next.data);
    // System.out.println(a.next.next.next.data);
    // System.out.println(a.next.next.next.next.data);
    print(a);
  }
}
