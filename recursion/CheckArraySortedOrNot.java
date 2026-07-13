package recursion;
public class CheckArraySortedOrNot{
public static boolean checkSortedornot(int arr[],int element){
   if(arr.length-1==0||arr.length-1==element){
  return true;
   } 
   if(arr[element]>=arr[element+1]){
    return false;
   }
   return  checkSortedornot(arr,element+1);
   
}
public static void main(String args[]){
    int arr[]={1,3,3};
    boolean result=checkSortedornot(arr,0);
    System.out.println(result);
}
}