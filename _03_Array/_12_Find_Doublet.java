public class _12_Find_Doublet {
  public static void main(String[] args) {
    int num[] = { 5, 2, 7, -1 };
    int x = 9;
    for (int i = 0; i < num.length; i++) {
      for (int j = i + 1; j < num.length; i++) {
        if (num[i] + num[j] == x) {
          System.out.println(num[i] + " " + num[j]);
          break;
        }
      }
    }
  }
}
