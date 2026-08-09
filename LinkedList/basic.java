package LinkedList;


public class basic {
   public static class Node{
    int data;
    Node next;
    //constructor
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node Head;
public static Node Tail;
//add first node
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

    
    public static void main(String[] args) {
       basic ll=new basic();
       ll.firstAdd(10);
       ll.firstAdd(20);


        
    } 
    

}
