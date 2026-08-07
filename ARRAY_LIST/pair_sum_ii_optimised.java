package ARRAY_LIST;

import java.util.ArrayList;

public class pair_sum_ii_optimised {
    public static boolean pairSum(ArrayList<Integer>List,int target){
       int lp=0;
       int n=List.size()-1;
       int rp=n-1;
       while(lp<rp){
        if((List.get(lp)+List.get(rp))==target){
            return true;
        } 
        //updated the pointer approach
        else if((List.get(lp)+List.get(rp))<target){
            lp++;
        }
        else{
            rp--;
        }
         }
         return false; 
    }
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
         List.add(2);
          List.add(3);
           List.add(4);
            List.add(5);
             List.add(6);
             int target=9;
            System.out.print(pairSum(List, target));
    }
    
    
}
