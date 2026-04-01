
public class _05_Array_Implementation_Of_Queue {
   public static class Que{
    int f=-1;
    int r=-1;
    int size=0;
    int[] arr=new int[5];
    public void add(int val){
      if(r==arr.length-1){
        System.out.println("Queue is full");
        return;
      }if(f==-1 && r==-1){
        f=r=0;
        arr[r]=val;
      }else{
        arr[r++]=val;
      }
      size++;
    }
    public int remove(){
      // underflow
      if(size==0){
        System.out.println("Queue is empty");
        return -1;
      }
      int val=arr[f];
      f++;
      size--;
      return val;
    }
    public int peek(){
      if(size==0){
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[f];
    }
    public boolean isEmpty(){
      if(size==0)return true;
      return false;
    }
    public void display(){
      if(size==0){
        System.out.println("Queue is empty");
      }else {
        for(int i=f;i<=r;i++){
          System.out.print(arr[i]+" ");
        }

      }
      System.out.println();
    }
   } 
  public static void main(String[] args) {
    Que q=new Que();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.display();
  }
}
