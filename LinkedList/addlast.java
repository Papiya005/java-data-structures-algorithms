package LinkedList;

public class addlast {
    public static Node Head;
    public static Node Tail;

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            
        }
    }
    public void addLast(int data){
       
//create a new node
        Node newNode=new Node(data);
         if(Tail==null){
            Head=Tail=newNode;
            return;
        }
     Tail.next=newNode;//references not value
     Tail=newNode;
     

    }
    public static void main(String[] args) {
        addlast ll=new addlast();
        ll.addLast(100);
        ll.addLast(200);

    }
    
}
