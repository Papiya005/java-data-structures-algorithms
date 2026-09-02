package LinkedList;
// import java.util.*;
    
class node {
    int data;
    node next;
   public node(int data){
        this.data=data;
        this.next=null;
    }
}
//




public class mergeSort {
    public static node head;
public static node tail;
   public static void main(String[] args) {
    mergeSort ll=new mergeSort();

    ll.firstAdd(1);
    ll.firstAdd(2);
    ll.firstAdd(3);
    ll.firstAdd(4);
    ll.firstAdd(5);
  ll.print();
    head = ll.LinkedList_merge(head);
    ll.print();
}
public void print(){
node temp = head;

while(temp != null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
}
System.out.println("null");
}

public void firstAdd(int var1) {
      node var2 = new node(var1);
      
      if (head == null) {
         tail = var2;
         head = var2;
      } else {
         var2.next = head;
         head = var2;
      }
   }

    
 

//find the mid
public node getMid(node head){
    node slow=head;
    node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
//call to merge function
public node merge(node head1,node head2){
    node mergeLL=new node(-1);
   node temp=mergeLL;
    while(head1!=null && head2 !=null){
     if(head1.data<=head2.data){
        temp.next=head1;
        temp=temp.next;
        head1=head1.next;
     }else{
         temp.next=head2;
        temp=temp.next;
        head2=head2.next;
     }
    }
    //remaining element
    while(head1 != null){
         temp.next=head1;
        temp=temp.next;
        head1=head1.next; 
    }
    while(head2 != null){
        temp.next=head2;
        temp=temp.next;
        head2=head2.next;
    }
    
    return mergeLL.next;
}


public node LinkedList_merge(node head){
    if(head ==null || head.next ==null){
        return head;
    }
    node middleNode=getMid(head);
    node righthead=middleNode.next;
     middleNode.next=null;
    node left=LinkedList_merge(head);
      node right=LinkedList_merge(righthead);
    return merge(left,right);
}
}




    

