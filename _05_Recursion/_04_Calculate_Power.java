class Demo{
  static int power(int a,int b){
     if(b>=1){
      return a*power(a,b-1);
     }else{
      return 1;
     }
  }
}

public class _04_Calculate_Power {
  public static void main(String[] args) {
     System.out.print( Demo.power(2, 4));
  }
}
