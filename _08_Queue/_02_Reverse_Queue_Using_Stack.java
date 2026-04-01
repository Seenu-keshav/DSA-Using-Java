
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _02_Reverse_Queue_Using_Stack {
  static Queue<Integer> q;
  static void print(){
    System.out.println(q);
  }
  static void reverseQueue(){
    Stack<Integer> st=new Stack<>();
    while(!q.isEmpty()){
      st.push(q.remove());
    }
    while(!st.isEmpty()){
      q.add(st.pop());
    }
  }
  public static void main(String[] args) {
   q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    print();
    reverseQueue();
    print();
  }
}
