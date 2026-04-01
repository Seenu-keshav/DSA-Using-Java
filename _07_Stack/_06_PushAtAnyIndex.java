
import java.util.Stack;

public class _06_PushAtAnyIndex {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);

    int new_element = 70;
    int pos = 2;
    Stack<Integer> temp = new Stack<>();
    while (st.size() >= pos) {
      temp.push(st.pop());
    }
    st.push(new_element);
    while (temp.size() > 0) {
      st.push(temp.pop());
    }
    System.out.println(st);
  }
}
