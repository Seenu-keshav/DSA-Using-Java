public class _14_Toggle_String {
  public static void main(String[] args) {
    String str = "PhySics";
    System.out.println("Original  : " + str);
    for (int i = 0; i < str.length(); i++) {
      boolean flag = true;
      char ch = str.charAt(i);
      if (ch == ' ')
        continue;
      int asci = (int) ch;
      if (asci >= 97)
        flag = false;
      if (flag == true) {
        asci += 32;
        char dh = (char) asci;
        str = str.substring(0, i) + dh + str.substring(i + 1);
      } else {
        asci -= 32;
        char dh = (char) asci;
        str = str.substring(0, i) + dh + str.substring(i + 1);
      }
    }
    System.out.println("Toggled : " + str);
  }
}
