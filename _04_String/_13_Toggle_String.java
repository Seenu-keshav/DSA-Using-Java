import java.util.Scanner;

public class _13_Toggle_String {
  public static void main(String[] args) {
    // A->65
    // a->97
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    // toggle
    // PHysiCs->phYSIcS
    for (int i = 0; i < str.length(); i++) {
      // P->p
      // check -> alphabet - small,capital
      boolean flag = true; // true-> capital
      char ch = str.charAt(i);
      if (ch == ' ')
        continue;
      int asci = (int) ch;
      if (asci >= 97)
        flag = false;
      if (flag == true) {
        asci += 32;
        char dh = (char) asci;
        str.setCharAt(i, dh);
      } else {
        asci -= 32;
        char dh = (char) asci;
        str.setCharAt(i, dh);
      }

    }
    System.out.println(str);
  }
}