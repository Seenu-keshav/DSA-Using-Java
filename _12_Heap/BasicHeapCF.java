
import java.util.PriorityQueue;


public class BasicHeapCF {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.add(10);
    System.out.println(pq+" "+pq.peek());
    pq.add(30);
    System.out.println();
  }
}
