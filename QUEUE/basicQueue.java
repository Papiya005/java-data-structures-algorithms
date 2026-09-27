//implement queue using array;
package QUEUE;
 public class basicQueue{
   static class Queue{
    int arr[];
    int rear;
    int size;

     Queue(int n){
        
       arr= new int[n];
        size=n;
        rear=-1;
        

     }
     //perform four operations which is isEmpty,add,remove and peek
    //  check whether the queue is empty or not
     public boolean isEmpty(){
        return rear==-1;
     }
     //add
     public void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;

        }
        rear=rear+1;
        arr[rear]=data;
        
     }
     //remove
     public int remove(){
      if(isEmpty()){
        System.out.println(("queue is empty"));
        return -1;
      }
      int front=arr[0];
      for(int i=0;i<rear;i++){
        arr[i]=arr[i+1];
         
      }
      rear--;
      return front;
     }
     //peek
     public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int peek=arr[0];
        return peek;

     }


    }


 public static void main(String[] args) {
   Queue queue=new Queue(5);
   queue.add(1);  
   queue.add(2); 
   queue.add(3); 
   while(!queue.isEmpty()){
     System.out.println(queue.peek());
     queue.remove();
   }
 }

}