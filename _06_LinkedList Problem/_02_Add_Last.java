// 01) Inserting the data first  ------------> ok
// 02) Inserting the data last --------------> ok
// 03) Inserting the data at position -------> 
// 04) Sorted Insertion Asc/Desc ------------> 
// 05) Traversing or Displaying -------------> ok
// 06) Size or Length of list ---------------> ok
// 07) Reverse List -------------------------> 
// 08) Searching ---------------------------->ok 
// 09) Deleting from first ------------------> 
// 10) Deleting from last -------------------> 
// 11) Delete from position -----------------> 
// 12) Deleting Element ---------------------> 
// 13) Deleting Elements --------------------> 
// 14) Deleting Duplicates ------------------> 
// 15) Copy the reversed list ---------------> 
// 16) Copy of original list ----------------> 
// 17) Comparing two list objects ------------------> 
// 18) Finding nth node from beginning and ending ---> 

class SLL {
  Node head;
  int size;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // 4. get SIze
  int getSize() {
    return this.size;
  }

  // 2. add last
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

  // 1 . add first
  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // 3. print linked list
  void printSll() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  // 5. search
  boolean search(int data) {
    Node currNode = head;
    while (currNode != null) {
      if (currNode.data == data)
        return true;
      currNode = currNode.next;
    }
    return false;
  }

  // 6
}

public class _02_Add_Last {

  public static void main(String args[]) {

    SLL sll = new SLL();
    sll.addFirst(222);
    sll.addLast(111);
    sll.printSll();
  }

}
