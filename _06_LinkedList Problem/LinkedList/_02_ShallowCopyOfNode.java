
public class _02_ShallowCopyOfNode {
  public static void main(String[] args) {
    Node a = new Node(100);
    // Node temp=a; // shallow copy
    Node temp = new Node(100);// deep copy
    System.out.println(temp);
    System.out.println(a);
    System.out.println(a.data);
    System.out.println(temp.data);
  }
}
