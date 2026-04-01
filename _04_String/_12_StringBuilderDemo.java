public class _12_StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append("str");
    str.append(10);
    str.setCharAt(0, 'c');
    System.out.println(str);
    str.insert(1, 'b');
    System.out.println(str);
    str.reverse();
    System.out.println(str);
    str.deleteCharAt(1);
    System.out.println(str);
    StringBuilder sb = new StringBuilder("Physics");
    sb.reverse();
    System.out.println(sb);
    sb.reverse();
    sb.delete(1, 2);
    System.out.println(sb);
    System.out.println(sb.substring(3));
  }
}
