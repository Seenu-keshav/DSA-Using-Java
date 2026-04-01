//01. Implement a program to print natural numbers from 1 to n


class Demo{
  static void print(int n){
    if(n>0){
      print(n-1);
      System.out.println(n);
    }
  }
}




public class _02_Natural_Number {
  public static void main(String args[]){
 Demo.print(5);
  }
  
}
