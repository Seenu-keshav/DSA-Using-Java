
import java.util.PriorityQueue;

public class _02_KthLargestElement {
  public static void main(String[] args) {
    int[] arr = { 10, 2, 8, 3, -6, -2, 9, -1, 2 };
    int k = 6;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int ele : arr) {
      pq.add(ele);
      if (pq.size() > k)
        pq.remove();
    }
    System.out.println(pq.peek());
  }
}
