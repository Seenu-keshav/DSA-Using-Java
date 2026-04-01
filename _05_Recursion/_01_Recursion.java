
import java.util.Scanner;

class Demo{
  static int c;

  void m(){
    if(c>10)
    return;
    else{
    System.out.println("Good Evening");
    c++;
     m() ;
  }
 
  }
}



public class _01_Recursion{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Demo d=new Demo();
    d.m();
  }
}



