
import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements  Comparable<Triplet>{
  int d;
  int x;
  int y;

  Triplet(int d, int x, int y) {
    this.d = d;
    this.x = x;
    this.y = y;
  }
  public int compareTo(Triplet t){
    return this.d-t.d;
  }
}

public class _03_KClosetPointsToOrigin {
  public static void main(String[] args) {
    int[][] arr = { { 3, 2 }, { 5, -2 }, { -2, 14 }, { 1, 0 }, { 3, 2 } };
    int k = 2;
    PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++) {
      int x = arr[i][0];
      int y = arr[i][1];
      int d = x * x + y * y;
      pq.add(new Triplet(d, x, y));
      if (pq.size() > k)
        pq.remove();

    }

    int[][] ans = new int[k][2];
    for (int i = 0; i < k; i++) {
      Triplet t = pq.remove();
      ans[i][0] = t.x;
      ans[i][1] = t.y;
      System.out.println(ans[i][0] + " " + ans[i][1]);
    }

  }
}
