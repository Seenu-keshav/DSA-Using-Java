
public class _04_Vowel {
  public static void main(String[] args) {
    String s = "Raushan singh is a teacher";
    int n = s.length();
    int count = 0;
    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (isVowel(ch) == true)
        count++;
    }
    System.out.println(count);
  }

  public static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'A')
      return true;
    if (ch == 'e' || ch == 'E')
      return true;
    if (ch == 'i' || ch == 'I')
      return true;
    if (ch == 'o' || ch == 'O')
      return true;
    if (ch == 'u' || ch == 'U')
      return true;
    return false;
  }
}
