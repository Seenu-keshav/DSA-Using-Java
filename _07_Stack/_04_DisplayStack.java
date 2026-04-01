
import java.util.Stack;

public class _04_DisplayStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    System.out.println(st);
    while (!st.isEmpty()) {
      System.out.print(st.pop() + " ");
    }
  }
}
