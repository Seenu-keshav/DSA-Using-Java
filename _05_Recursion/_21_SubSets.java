
import java.util.ArrayList;

public class _21_SubSets {
  static ArrayList<String> arr = new ArrayList<>();

  public static void printSubsets(int i, String s, String ans) {
    if (i == s.length()) {
      arr.add(ans);
      System.out.println(ans);
      return;
    }
    char ch = s.charAt(i);
    printSubsets(i + 1, s, ans + ch);
    printSubsets(i + 1, s, ans);
  }

  public static void main(String[] args) {
    String s = "abcd";
    printSubsets(0, s, "");

  }
}
