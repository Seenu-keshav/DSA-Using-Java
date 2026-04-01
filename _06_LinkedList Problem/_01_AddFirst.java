
// 01) Inserting the data first  ------------> ok
// 02) Inserting the data last --------------> ok
// 03) Inserting the data at position -------> ok
// 04) Sorted Insertion Asc/Desc ------------> ok
// 05) Traversing or Displaying -------------> ok
// 06) Size or Length of list ---------------> ok
// 07) Reverse List -------------------------> ok
// 08) Searching ----------------------------> ok
// 09) Deleting from first ------------------> ok
// 10) Deleting from last -------------------> ok
// 11) Delete from position -----------------> ok
// 12) Deleting Element ---------------------> ok
// 13) Deleting Elements --------------------> ok
// 14) Deleting Duplicates ------------------> ok
// 15) Copy the reversed list ---------------> ok
// 16) Copy of original list ----------------> ok
// 17) Comparing two list objects ------------------> ok
// 18) Finding nth node from beginning and ending ---> ok

class LL {
  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  // 01) Inserting the data first ------------> ok
  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // 02) Inserting the data last --------------> ok
  void addLast(int data) {
    Node newNode = new Node(data);
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

  // 09) Deleting from first ------------------> ok
  void deleteFirst() {
    if (head == null)
      return;
    head = head.next;
  }
  // 10) Deleting from last -------------------> ok

  void deleteLast() {
    if (head == null) {
      System.out.println("list is empty");
      return;
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

  void printList() {
    Node newNode = head;
    if (newNode == null) {
      return;
    }
    while (newNode != null) {
      System.out.println("Data is " + newNode.data);
      newNode = newNode.next;
    }
  }

}

public class _01_AddFirst {

  public static void main(String args[]) {
    LL list = new LL();
    list.addFirst(333);
    list.addFirst(222);
    list.addFirst(111);
    list.addLast(444);
    list.addLast(555);
    list.addLast(666);
    list.printList();// 111=>222=>333=>444=>555=>666=>NULL
    System.out.println("after deltion of first element");
    list.deleteFirst();
    list.deleteFirst();
    list.printList();// 333=>444=>555=>666=>NULL
    System.out.println("After deletion of last node");
    list.deleteLast();
    list.deleteLast();
    list.printList();// 333=>444=>NULL

  }

}
