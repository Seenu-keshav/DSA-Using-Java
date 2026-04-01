
class SLL {
  Node head;
  int size;

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }

  }

  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = newNode;
    head = newNode;
  }

  void addAtPos(int data, int pos) {
    Node newNode = new Node(data);
    int i = 0;
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    Node prevNode = null;
    while (currNode.next != null && i < pos) {
      prevNode = currNode;
      currNode = currNode.next;
      i++;
    }
    prevNode.next = newNode;
    newNode.next = currNode;

  }

  void printList(Node head) {
    Node temp = head;
    if (head == null) {
      return;
    }

    while (temp != null) {
      System.out.println(temp.data);
    }
  }
}

public class _03_Add_At_Pos {
  public static void main(String[] args) {

  }
}
