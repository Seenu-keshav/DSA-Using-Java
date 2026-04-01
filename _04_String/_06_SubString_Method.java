
public class _06_SubString_Method {
  public static void main(String[] args) {
    String str = "abcde";
    System.out.println(str.substring(1));
    System.out.println(str.substring(3));
    System.out.println(str.substring(1, 4));
    // print all substring
    for (int i = 1; i <= 5; i++) {
      System.out.println(str.substring(0, i));
    }

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= 5; j++) {
        System.out.println(str.substring(i, j));
      }
    }
    System.out.println("hello" + 10 + 20);
    System.out.println(10 + 20 + "hello");
  }
}
