
import java.util.Collections;
import java.util.PriorityQueue;

public class _02_KthSmallestElement {
  public static void main(String args[]) {
    int[] arr = { 10, 2, 8, 3, -6, -2, 9, -1, 2 };
    int k = 6;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int ele : arr) {
      pq.add(ele);
      if (pq.size() > k)
        pq.remove();
    }
    System.out.println(pq.peek());
  }
}
