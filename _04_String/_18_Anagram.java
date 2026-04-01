
import java.util.Arrays;

public class _18_Anagram {

  public boolean anagram() {
    String s1 = "race";
    String s2 = "care";
    if (s1.length() != s2.length())
      return false;

    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i])
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // racecar->racecar palindrom
    // listen ->silent --> anagram
    // race->care --> anagram
    // 1. hashmap
    // 2.

  }
}
