// step : 1 creating ll class 
// step :2 creating Node class inside the class
// step : 3 creating print method
// step : 4 creating addFirst method
// step : 5 crating addLast method

class LL {
  Node head;

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // 2. implementing the add first method in linked-list
  void addFirst(int data) {
    // step : 1 creating new node by given data
    Node newNode = new Node(data);
    // step : 2 checking head is null if null then assign the newNode to the head
    if (head == null) {
      head = newNode;
      return;
    }
    // step : 3 if head is not null then assign the newNode next to the head
    newNode.next = head;
    // step 4: assign the head to the newNode
    head = newNode;
  }

  // 3 . add last method
  void addLast(int data) {
    // step : 1 creating node
    Node newNode = new Node(data);
    // step : 2 check the head is null or not
    if (head == null) {
      head = newNode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  // 4. delete from starting method
  void deleteFirst() {
    // step : 1 check the head is null
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    // step : 2 move the head to head next
    head = head.next;
  }

  // 5. delete from end method
  void deleteLast() {
    // check the head is null
    if (head == null) {
      System.out.println("List is empty");
    }
    if (head.next == null) {
      head = null;
      return;
    }

    Node temp1, temp2;
    temp1 = head;
    temp2 = head.next;
    while (temp2.next != null) {
      temp2 = temp2.next;
      temp1 = temp1.next;
    }
    temp1.next = null;
  }

  // 1. printing linked-list
  void printList() {
    // check the head is null
    if (head == null) {
      System.out.println("list is empty");
      return;
    } else {
      // if head is not null then print the data
      // step 1: assign the head to the temp so that temp can traverse to the data
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " => ");
        temp = temp.next;
      }
      System.out.println("NULL");
    }
  }

}

public class _001_LinkedListImpl {
  public static void main(String[] args) {
    LL ll = new LL();
    ll.printList(); // first creating print function
    ll.addFirst(333); // second creating addFirst function
    ll.addFirst(222);
    ll.addFirst(111);
    ll.printList();
    ll.addFirst(000);
    ll.addLast(444);
    ll.addLast(555);
    ll.printList();
    ll.deleteFirst();
    ll.printList();
    ll.deleteLast();
    ll.deleteLast();
    ll.printList();
  }
}
