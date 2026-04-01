
import java.util.Stack;

public class _03_CopyStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    System.out.println(st);
    Stack<Integer> temp = new Stack<>();
    while (!st.isEmpty()) {
      temp.push(st.pop());
    }
    System.out.println(temp);
    Stack<Integer> st_final = new Stack<>();
    while (!temp.isEmpty()) {
      st_final.push(temp.pop());
    }
    System.out.println(st_final);
  }
}
