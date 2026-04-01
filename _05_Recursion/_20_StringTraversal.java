public class _20_StringTraversal {
  public static void print(int i, String s) {
    if (i == s.length())
      return;
    System.out.println(s.charAt(i));
    print(i + 1, s);
  }

  public static void skip(int i, String s, String ans) {

    if (i == s.length()) {
      System.out.println(ans);
      return;
    }
    if (s.charAt(i) != 'a')
      ans += s.charAt(i);
    skip(i + 1, s, ans);
  }

  public static void main(String[] args) {
    String s = "Raushan Singh";
    skip(0, s, "");
    // print(0, s);
  }
}
