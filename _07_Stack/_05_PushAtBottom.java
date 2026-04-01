
import java.util.Stack;

public class _05_PushAtBottom {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    int new_element = 60;
    Stack<Integer> temp = new Stack<>();
    while (st.size() > 0) {
      temp.push(st.pop());
    }
    st.push(new_element);
    while (temp.size() > 0) {
      st.push(temp.pop());
    }
    System.out.println(st);
  }
}
