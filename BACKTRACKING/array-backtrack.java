package BACKTRACKING;
class ArrayBacktrack {
    public static void backTrack(int arr[],int i,int val){
        // i is for index and val is for taking a value inside an array;
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        backTrack(arr, i+1, val+1);
        //backtracking
        arr[i]=arr[i]-2;

     

    }
    public static void printArr(int arr[]){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        
    }
	public static void main(String[] args) {
		// entry point
        int arr[]=new int[5];
   backTrack(arr, 0, 1);
        printArr(arr);

	}
}
