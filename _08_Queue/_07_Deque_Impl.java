public class _07_Deque_Impl {
  static class Node{
    int data;
    Node prev,next;
    Node (int data){
      this.data=data;
      this.prev=null;
      this.next=null;
    }
  }

  static class Deque{
    Node front;
    Node rear;
    int size;
    Deque(){
      front=rear=null;
      size=0;
    }
    boolean isEmpty(){
      if(size==0)return true;
      return false;
    }
    int size(){
      return size;
    }
    void insertFront(int data){
      Node newNode=new Node(data);
      if(front==null){
        rear=front=newNode;

      }else{
        newNode.next=front;
        front.prev=newNode;
        front=newNode;
      }
    }
    void insertRear(int data){
       Node newNode=new Node(data);
       if(rear==null){
        front=rear=null;
       }else{
        newNode.prev=rear;
        rear.next=newNode;
        rear=newNode;
       }
       size++;
    }
    void deleteFront(){
      if(size==0){
        System.out.println("Underflow");
      }
    }
  }
  public static void main(String[] args) {
    
  }
}
