package BACKTRACKING;

public class subset {
    public static void subset(String str,int i,String newstr){
        if(i==str.length()){
            if(newstr.isEmpty()){
                System.out.print("null");
            }
            else{
             System.out.println(newstr);
            }
           
            return;
        }
        //to be
      
        subset(str,i+1,newstr+str.charAt(i));
        //not to be
        subset(str, i+1, newstr);

    }
    public static void main(String[] args) {
        String str="abc";
        subset(str, 0, "");


    }
}
