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
  //recursive search
  public int helper(node head,int key){
    if(head==null){
      return -1;

    }
    if(head.data==key){
      return 0;


    }
    int idx=helper(head.next,key);
    if(idx==-1){
      return -1;
    }
    return idx+1;
  }
  public int recSearch(int key){
    return helper( head, key);
  }
  //reverse the likedlist
  public void reversed(){
    if(head==null){
      System.out.println("ll is empty");
    }
    
   node prev=null;
   node curr=head;
   node next;
   while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
    

   }
   head=prev;
  
  }

  //delete from nth node
  public void deleteNthNode(int n){
    //calculate the size
    node temp=head;
    int sz=0;
    while(temp!=null){
      temp=temp.next;
      sz++;
    }
    //  if i have to delete the head node
    if(n==sz){
      head=head.next;
      return;
    }
    //sz-n operations
    int i=1;
  int idxToFind =sz-n;
   node prev=head;
  while(i<idxToFind){
   prev=prev.next;
   i++;
  }
  prev.next=prev.next.next;
  return;
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
int idx=ll.recSearch(8);
System.out.println("idx at -->"+idx);
System.out.println("Before Reversed -->");
ll.printList();
ll.reversed();
System.out.println("After reversed -->");
ll.printList();
//delete from the nth node
ll.deleteNthNode(3);
ll.printList();
  }
  }
 