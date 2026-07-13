package recursion;
public class checkallXtotheend{
    public static void movextotheend(String str,int idx,int count, String newStr){
       if(idx==str.length()) {
        for(int i=0;i<count;i++){
            newStr+="x";
        }
        System.out.println( newStr);
        return;
       }
       char currchar=str.charAt(idx);
       if(currchar=='x'){
        count++;
        movextotheend(str, idx+1, count, newStr);

       }
       else{
        newStr+=currchar;
        movextotheend(str, idx+1, count, newStr);
       }
      
        
    }

    public static void main(String[] args) {
       String str="axbcxxd";
       movextotheend(str,0,0,"");

    }
}