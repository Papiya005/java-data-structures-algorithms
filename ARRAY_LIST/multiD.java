package ARRAY_LIST;
import java.util.*;
public class multiD{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);
        //new arraylist
       ArrayList<Integer>list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
         mainlist.add(list1);
         //traverse 
         for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
         }
          System.out.print(mainlist);

    }

}