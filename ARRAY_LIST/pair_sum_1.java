package ARRAY_LIST;

import java.util.ArrayList;

public class pair_sum_1 {
    public static boolean Sum(ArrayList<Integer>List,int target){
        int n=List.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(List.get(i)+List.get(j)==target){
                    return true;
                }
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
             int target=5;
             System.out.print(Sum(List, target));
    }
    
}
