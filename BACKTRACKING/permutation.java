package BACKTRACKING;
public class permutation{
    public static int fact(int n) {
         
         int fact=1;
         for(int i=1;i<=n;i++){
            fact=fact*i;
         }
        return fact;
    }
    public static int PrintPermutation(int n,int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr=fact(n-r);
       return n_fact/nmr;
    }
    public static void main(String[] args) {
        String str="abc";
        int r=str.length();
        System.out.println(r);
    }
}