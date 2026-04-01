class SLL {
  Node head;
  Node tail;
  int size;

  void insertAtEnd(int val) {
    Node temp = new Node(val);
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
    size++;
  }

  void insert(int idx, int val) {
    Node temp = new Node(val);
    if (idx == 0) {
      InsertAtHead(val);
      return;
    }
    if (idx == size) {
      insertAtEnd(val);
      return;
    }
    if (idx > size) {
      System.out.println("Invalid index");
      return;
    }
    Node x = head;
    for (int i = 1; i <= idx - 1; i++) {
      x = x.next;
    }
    temp.next = x.next;
    x.next = temp;
    size++;
  }

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  void InsertAtHead(int val) {
    Node temp = new Node(val);
    if (head == null)
      head = tail = temp;
    else {
      temp.next = head;
      head = temp;
    }
    size++;
  }
}

public class _03_implementationLL {

  public static void main(String[] args) {
    SLL list = new SLL();
    list.insertAtEnd(10);
    list.insertAtEnd(40);
    list.insertAtEnd(50);
    list.insertAtEnd(30);
    list.display();
    System.out.println(list.size);
    list.InsertAtHead(80);
    list.display();
    System.out.println(list.size);
    list.insert(2, 20);
    list.display();
  }
}
