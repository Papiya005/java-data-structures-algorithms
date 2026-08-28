package LinkedList;
 public class iteratorSerach{
    public static node head;
    public static node tail;
    public static int size;

  class node{
   int data;
  node next;
 public node(int data){
   this.next=null;
   this.data=data;

}

    
  }
  //add first to the linkedList
  public void  addfirst(int data){
node newnode=new node(data);
size++;
newnode.next=head;
head=newnode;




  }

  //add last
  public void addLast(int data){
   node newnode=new node(data);
    size++; 
   if(head==null){
    head=tail=newnode;
   }
  else{
 node temp=head;
 while(temp.next!=null){
    temp=temp.next;

 }
 temp.next=newnode;
   tail=newnode;
   
  }
  

  }
  //print the linked list
  public void printList(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        
    }
    System.out.println("null");
  }
  //iterator search
  public int itrSearch(int key){
    node temp=head;
    int i=0;
    while(temp!=null){
      if(temp.data==key){
        return i;
      }
      temp=temp.next;
      i++;

    }
    return -1;

  }
 
 public static void main(String args[]){
iteratorSerach ll=new iteratorSerach();
ll.addfirst(4);
ll.printList();
ll.addfirst(3);
ll.printList();
ll.addfirst(2);
ll.printList();
ll.addfirst(1);
ll.printList();
ll.addLast(5);
ll.printList();
ll.addLast(6);
ll.printList();
ll.addLast(7);
ll.printList();
ll.addLast(8);
ll.printList();
System.out.println(size);
int result=ll.itrSearch(8);
System.out.println("index at --> "+ result);
  }
  }
 