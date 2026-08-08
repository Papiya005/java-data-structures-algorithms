package ARRAY_LIST;
import java.util.*;


public class pair_sum_ii_circular {
    public static boolean pair_sum( ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<n-1;i++){
        if(list.get(i)>list.get(i+1)){
            bp=i;
            break;
        }
        }
        
        
        //find
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            //updated
            if((list.get(lp)+list.get(rp))<target){
                lp=(lp+1)%n;

            }
            else{
                rp=(rp+n-1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        
        List.add(11);
         List.add(15);
          List.add(6);
           List.add(8);
            List.add(9);
             List.add(10);
             int target=19;
             System.out.print(pair_sum(List, target));


    }
    
}
