package LinkedList;

public class addlast {
    public static Node Head;
    public static Node Tail;
    public static int size=0;

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
    size++;
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
        size++;
         if(Tail==null){
            Head=Tail=newNode;
            return;
        }
     Tail.next=newNode;//references not value
     Tail=newNode;
     

    }
    //print the linklist
    public  void printList(){
        if(Head==null){
            System.out.print("ll is empty");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+ "-> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    //add in the middle 
    public void addMiddle(int idx, int data){
        if(idx==0){
            firstAdd(data);
            return;
        }
        //find that index where have to add the index
        int i=0;
        //think like  = is as -> 
         Node newNode=new Node(data);
         size++;
        Node temp=Head;
        
        while(i<idx-1){
        temp=temp.next;
            i++;
        }
       newNode.next=temp.next;
        temp.next=newNode;

       

    }

    public static void main(String[] args) {
        addlast ll=new addlast();
        ll.addLast(98);
        ll.addLast(99);
        ll.addLast(100);
        ll.addLast(200);
         ll.addMiddle(2,9);
        ll.printList();
        System.out.print(ll.size);
       

    }
    
}
