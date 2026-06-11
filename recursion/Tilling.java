package recursion;

public class Tilling{
    public static int tilling(int n){
        if(n==0||n==1){
            return 1;
        }
        //vertically alignment
        int fnm1=tilling(n-1);
        //horizontally
         int fnm2=tilling(n-2);


         //total ways
         int total=fnm1+fnm2;
    return total;

    }
    public static void main(String args[]){
       System.out.println(tilling(4));
     
    }

}