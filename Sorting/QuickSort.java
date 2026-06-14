package Sorting;
public class QuickSort{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void Quicksorted(int arr[],int st,int end){
        //base case
        if(st>=end){
            return;
        }
        int pIdx=partition(arr,st,end);
        Quicksorted( arr, st,pIdx-1);
         Quicksorted( arr, pIdx+1,end);



    }
    public static int partition(int arr[],int st,int end){
        int Pivot= arr[end];
        int i=st-1;
        for(int j=st;j<end;j++){
            if(arr[j]<Pivot){
                i++;
                int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
            
        }
        i++;
        int temp=arr[i];
            arr[i]= arr[end];
            arr[end]=temp;

            return i;
    }
public static void main(String args[]){
   int arr[]={6,3,9,8,2,5};
   Quicksorted(arr, 0, arr.length-1);
   PrintArray(arr);
}
}

