public class _11_Modify_Charcter {
  public static void main(String[] args) {
    String s = "Hello";
    // 2nd index change karna hai
    s = s.substring(0, 2) + 'y' + s.substring(3);
    System.out.println(s);
  }
}
