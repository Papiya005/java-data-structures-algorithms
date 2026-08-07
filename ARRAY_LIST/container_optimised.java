package ARRAY_LIST;
import java.util.*;
public class container_optimised {
    public static int container_water(ArrayList<Integer> height){
       int lp=0;
       int n=height.size();
       int rp= n-1;
       int max=0;
       while(lp<rp){
        //water area
        int hi=Math.min(height.get(lp),height.get(rp));
        int width=rp-lp;
        int currwater=hi*width;
        max=Math.max(currwater,max);
        //upadate
        if(height.get(lp)<height.get(rp)){
            lp++;

        }
        else{
            rp--;
        }
       }
       return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
     System.out.print(container_water(height));
    }

}

