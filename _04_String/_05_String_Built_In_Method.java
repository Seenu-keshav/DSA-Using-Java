
public class _05_String_Built_In_Method {
  public static void main(String[] args) {
    String s = "Raushan Singh";
    // System.out.println(s.indexOf("a"));
    // System.out.println(s.indexOf("c"));
    // System.out.println(s.lastIndexOf("a"));
    String a = "afc";
    String b = "abc";

    System.out.println(a.compareTo(b));
    // contains and StartsWith()
    String str = "Raushan";
    System.out.println(str.contains("sh"));
    System.out.println(str.startsWith("R"));
    System.out.println(str.endsWith("n"));

    // toLowerCase() toUpperCase() concat()
    String str2 = "Raushan Is a Teacher";
    System.out.println(str2.toLowerCase());
    System.out.println(str2.toUpperCase());

    System.out.println(str2.concat(" str"));
  }
}
