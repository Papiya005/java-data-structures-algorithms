package STACK;
import java.util.*;
public class reverseStack {
    //reverse the stack
    public static void pushAtButtom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtButtom(s,data);
        s.push(top);

    }
    //reverse the stack
    public static void reversEStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;//empty stack is always a reverse stack
        }
       int top=s.pop();
       reversEStack(s);
       pushAtButtom(s, top);

    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
           
        }
    }
   public static void main(String[] args) {
    Stack<Integer>s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    //321
    printStack(s);
    reversEStack(s);
    //123
    printStack(s);
   } 
}
