package recursion;

public class friendpairing {
    public static int friendPairing(int n){
     //base case
     if(n==1||n==2){
        return n;
     }
     //single friend
     int singlefriend=friendPairing(n-1);//n-1
     //other friend pairing 
     int otherfriends=singlefriend *friendPairing(n-2);//(n-1)*(n-2)
    
     int totalways=singlefriend+otherfriends;
     return totalways;
    }
   public static void main(String[] args) {
    System.out.println(friendPairing(3));
   }

}
