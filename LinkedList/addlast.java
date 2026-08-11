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
    public void firstAdd(int data){
    //create a new node
    Node newNode=new Node(data);
    //if null
    if(Head==null){
        Head=Tail=newNode;
        return;
    }
    //add new node to head
    newNode.next=Head;
    //head to newnode
    Head=newNode;

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
    //print the linklist
    public static void printList(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        addlast ll=new addlast();
        ll.addLast(98);
        ll.addLast(99);
        ll.addLast(100);
        ll.addLast(200);
        printList();

    }
    
}
