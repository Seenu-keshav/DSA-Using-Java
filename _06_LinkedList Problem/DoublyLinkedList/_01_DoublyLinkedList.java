class DNode {
  int val;
  DNode next;
  DNode prev;

  DNode(int val) {
    this.val = val;
  }
}

class DLL {
  DNode head;
  DNode tail;
  int size;

  void display() {
    DNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;

    }
    System.out.println();
  }

  void insertTail(int val) {
    DNode temp = new DNode(val);
    if (size == 0) {
      head = tail = temp;
    } else {
      tail.next = temp;
      temp.prev = tail;
      tail = temp;
    }
    size++;
  }

  void insertAtHead(int val) {
    DNode temp = new DNode(val);
    if (size == 0) {
      head = tail = temp;
    } else {
      temp.next = head;
      head.prev = temp;
      head = temp;
    }
    size++;
  }

}

public class _01_DoublyLinkedList {
  public static void print(DNode a) {
    DNode temp = a;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;

    }
    System.out.println();
  }

  public static void printReverse(DNode tail) {
    DNode temp = tail;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // DNode a = new DNode(10);
    // DNode b = new DNode(20);
    // DNode c = new DNode(30);
    // DNode d = new DNode(40);
    // DNode e = new DNode(50);
    // a.next = b;
    // b.prev = a;
    // b.next = c;
    // c.prev = b;
    // c.next = d;
    // d.prev = c;
    // d.next = e;
    // e.prev = d;
    // print(a);
    // printReverse(e);

    DLL list = new DLL();
    list.insertTail(10);
    list.insertTail(20);
    list.insertTail(30);
    list.insertTail(40);
    list.insertTail(50);
    list.display();
    System.out.println(list.size);
    list.insertAtHead(60);
    list.display();
    System.out.println(list.size);
  }
}
