
import java.util.Stack;

public class _07_DisplayRecursively {
  static void displayReverse(Stack<Integer> st) {
    if (st.isEmpty())
      return;
    int top = st.pop();
    System.out.println(top);
    displayReverse(st);
    st.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    displayReverse(st);
  }
}

