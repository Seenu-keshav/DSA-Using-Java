class Demo{
  static int product(int a,int b){
		if(a<b)
			return product(b,a);
		else if(b!=0)
			return a+product(a,b-1);
		else
			return 0;
	}
}

public class _05_Product {
  public static void main(String args[]){
       int pro=  Demo.product(10, 20);
       System.out.println("Product of 10 and 20 is: "+pro);
  }
  
}
