package BACKTRACKING;
public class permutation{
    public static void permutation(String str,String newString){
        //recursion
        if(str.length()==0){
            System.out.println(newString);
            return;
        }
        //choices
        for(int i=0;i<str.length();i++){
            //to be 
           //not to be
           char curr=str.charAt(i);
           String newStr=str.substring(0, i)+str.substring(i+1);
           permutation(newStr, newString+curr);


        }
    }
    
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "");
        
    }
}