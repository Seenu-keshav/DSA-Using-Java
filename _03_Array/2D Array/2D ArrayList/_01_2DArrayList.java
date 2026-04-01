
import java.util.ArrayList;
import java.util.List;

public class _01_2DArrayList {
  public static void main(String[] args) {
    List<List<Integer>> v = new ArrayList<>();
    List<Integer> a = new ArrayList();
    a.add(20);
    a.add(30);
    a.add(40);
    List<Integer> b = new ArrayList<>();
    b.add(40);
    b.add(50);
    List<Integer> c = new ArrayList<>();
    List<Integer> d = new ArrayList<>();
    d.add(60);
    v.add(a);
    v.add(b);
    v.add(c);
    v.add(d);

    // for (int i = 0; i < v.size(); i++) {
    // System.out.println(v.get(i));
    // }
    for (int i = 0; i < v.size(); i++) {
      List<Integer> x = v.get(i);
      for (int j = 0; j < x.size(); j++) {
        System.out.print(v.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}
