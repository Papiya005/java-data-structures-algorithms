package LinkedList;
import java.util.LinkedList;
public class jcf{
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
         ll.addLast(3);
          ll.addLast(4);
          System.out.print(ll);
           ll.removeLast();
            ll.removeFirst();
              System.out.print(ll);
              

    }
}