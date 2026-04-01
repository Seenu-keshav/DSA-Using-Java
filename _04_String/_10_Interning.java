public class _10_Interning {
  public static void main(String[] args) {
    String s = "Raushan";
    String q = "Raushan";
    String t = new String("Raushan");
    // s.charAt(0)="M"; not possible
    s = "Rohan"; // assigning not changing the real value
    System.out.println(s);
    // we can not change individual characters
    
  }
}
