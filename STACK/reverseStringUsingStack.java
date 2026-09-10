package STACK;
import java.util.*;
public class reverseStringUsingStack {
    public static String reverseStack(String str){
        Stack<Character>s=new Stack<>();
        int i=0;
        //push into stack
        while(i<str.length()){
            char curr=str.charAt(i);
          s.push(curr);
          i++;
        }

        //pop it in reverse
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char currChar=s.pop();
            sb.append(currChar);
        }
        return sb.toString(); 
    }
    public static void main(String[] args) {
      String str="abc";
      System.out.println(" Before reverseing the string :"+ str);
     System.out.println(" After reverseing The String :"+reverseStack(str));


    }
}
