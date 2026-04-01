class Demo{
  static int sun(int n){
    if(n==1) return 1;
    else return n+sun(n-1);
  }
}




public class _03_Sum_Of_Natural {
  public static void main(String[] args) {
     System.out.println( Demo.sun(10));
  }
}
