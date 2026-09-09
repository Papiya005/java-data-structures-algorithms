package STACK;

public class LinkedListStack {
    public static class node{
        int data;
        node next;
        public  node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class stack{
        public static node head=null;
        //isEmpty
        public static boolean isEmpty(){
        return head==null;
            
        }
         //push
        public static void push(int data) {
            node newNode=new node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

            
        }
       
        //peek
        public static int pop(){
           if(isEmpty()){
            return -1;

           } 
           int val=head.data;
           head=head.next;
           return val;
        }
        //pop
          public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
          }

    }
    public static void main(String[] args) {
        
        stack.push(1);
         stack.push(2);
          stack.push(3);
          while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
          }

        

        
    }
}
