package LinkedList;

class node {
    int data;
    node next;
    
    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class checkPalindrome {
    public static node head;
    public static node tail;
    //add last
public void addLast(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
        return;
    }
    node temp=head;
    while(temp.next!=null){
        temp=temp.next;

    }
    tail=temp;
    tail.next=newnode;
    tail=newnode;



}
//print the linedlist
public void printList(){
    node temp=head;
    while(temp!=null){
        
        System.out.print(temp.data+" -->");
        temp=temp.next;
    }
    System.out.println("null");
}
//find the medium
public node findMediun(node head){
    node slow=head;
    node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow;
}

// find whether is it palindrome or not
public boolean CheckPalindrome(){
    //base case
    if(head==null || head.next==null){
     return true;
    }
    //find the mediun
    node middle=findMediun(head);
    //reverse the second half-->three var and fouth steps involved there
    node prev=null;
    node curr=middle;
    node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    node right=prev;
    node left=head;

    //check the half half with the seconf half
    while(right!=null){
        if(left.data!=right.data){
            return false;

        }
        left=left.next;
        right=right.next;


    }
    return true;
}
public static void main(String[] args) {
    checkPalindrome ll=new checkPalindrome();
    // ll.addLast(1);
    // ll.addLast(2);
    // ll.printList();
    // System.out.println(ll.CheckPalindrome());
     ll.addLast(1);
    ll.addLast(2);
     ll.addLast(2);
    ll.addLast(1);
    ll.printList();
      System.out.println(ll.CheckPalindrome());
}
}
