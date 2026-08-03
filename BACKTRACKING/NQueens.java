package BACKTRACKING;
public class NQueens {
    //is safe funtion
    public static boolean isSafe(char chessboard[][],int row,int column){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][column]=='Q'){
                return false;
            }
        }
        //left diagonal up
         for(int i=row-1, j=column-1;i>=0 && j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal up
         for(int i=row-1,j=column+1;i>=0 && j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void N_Queens( char chessboard[][],int row){
        //base case
        if(row==chessboard.length){
            printboard(chessboard);
            return;
        }
        for(int j=0;j<chessboard.length;j++){
            if(isSafe(chessboard,row,j)){
            chessboard[row][j]='Q';
            N_Queens(chessboard, row+1);
            chessboard[row][j]='X';
            }
            
        }
    }
        public static void printboard( char chessboard[][]){
             System.out.println("_________________________");
            for(int i=0;i<chessboard.length;i++){
                for(int j=0;j<chessboard.length;j++){
                    System.out.print(chessboard[i][j]+" ");
                }
                System.out.println();
            }
        }

    
        public static void main(String[] args){
      int n=4;
   char chessboard[][]=new char[n][n];
   //intializing the board
   for(int i=0;i<chessboard.length;i++){
    for(int j=0;j<chessboard.length;j++){
      chessboard[i][j]='X';

    }
   }
    N_Queens(chessboard,0);
    }
   

    
}
