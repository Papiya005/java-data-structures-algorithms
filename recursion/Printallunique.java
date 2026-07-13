package recursion;

import java.util.HashSet;

public class Printallunique {
    public static void printAllUnique(String str,int idx,String newStr,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newStr)){
               return;
            }
            System.out.println(newStr);
            set.add(newStr);
            return;
        }
        char currchar=str.charAt(idx);
        //to be
        printAllUnique(str, idx+1, newStr+currchar, set);
        //not to be
        printAllUnique(str, idx+1, newStr, set);
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        printAllUnique(str, 0, "", set);

    }
    
}
