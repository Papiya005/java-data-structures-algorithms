package BACKTRACKING;
import java.util.*;
public class pattern1{
    public static void main(String args[]){
     int row;
     System.out.print("enter the row number :");
     Scanner sc=new Scanner(System.in);
     row=sc.nextInt();
     for(int i=1;i<=row;i++){
        for(int space=1;space<=row-i;space++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
     sc.close();

    }
}