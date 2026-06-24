package recursion;
public class towerofhanoi{
    private static void towerOfhanoi(int n,String S,String H,String D ){
        if(n==1){
           System.out.println("transfer of "+ n +"from"+S +"to "+D); 
           return;
        }
         towerOfhanoi(n-1, S, D, H);
        System.out.println("transfer of "+ n +"from"+S +"to "+D);
        towerOfhanoi(n-1, H, S, D);

    }
    public static void main(String[] args){
     int n=3;
     towerOfhanoi(n,"Src","Helper","Destination");
    }
}