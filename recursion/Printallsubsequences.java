package recursion;
public class Printallsubsequences{
    public static void printSubsequence(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //to be
         char currchar=str.charAt(idx);
        printSubsequence(str, idx+1, newstr+currchar);
        //not to be
        printSubsequence(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str="abc";
     printSubsequence(str, 0, "");

    }
}