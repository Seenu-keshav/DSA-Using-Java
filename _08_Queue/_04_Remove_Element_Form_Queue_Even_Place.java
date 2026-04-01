
import java.util.LinkedList;
import java.util.Queue;


public class _04_Remove_Element_Form_Queue_Even_Place {
  public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> helper=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
     while(!q.isEmpty()){
      q.remove();
       if(!q.isEmpty()){
        helper.add(q.remove());
       }
     }
    System.out.println(helper);
  }
}
