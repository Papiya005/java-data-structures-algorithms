package recursion;

public class fistandlastoccu {
    public static  int first=-1;
    public static  int last =-1;

    public static void firstOcu(String str,int idx,int n,int element){
    if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);

        return;
    }
    int currentchar=str.charAt(idx);
    if(currentchar==element){
        if(first==-1){
 first=idx;
        }
    else{
        last=idx;
    }
   
    }
    firstOcu(str, idx+1, n, element);
} 
    public static void main(String[] args) {
        String str="abaacdaefaah";
       firstOcu(str,0,str.length()-1,'a');
    }
    
}
