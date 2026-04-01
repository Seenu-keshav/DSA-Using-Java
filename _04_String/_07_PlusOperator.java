
public class _07_PlusOperator {
  public static void main(String[] args) {
    String s = "abc";
    s = s.concat("s");
    // s = s.concat(6); --> error

    s = s + "XYZ";
    s = s + 10;
    System.out.println(s);
    s = s + 'z';
    System.out.println(s);
  }
}
