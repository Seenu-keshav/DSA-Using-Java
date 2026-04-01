
import java.util.Arrays;

public class _10_SortMethod {
  public static void main(String[] args) {
    int[] arr={10,90,20,23,30,45,40,50};
    for(int x :arr){
      System.out.println(x);
    }
    Arrays. sort(arr);
    System.out.println();
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    } 
  }
}
