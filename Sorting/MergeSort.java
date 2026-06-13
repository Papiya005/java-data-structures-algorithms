  package Sorting;
  public class MergeSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void MergeSorted(int arr[],int st,int end) {
        if(st>=end){
            return;
        }
     int mid=st+(end-st)/2;
     MergeSorted(arr,st,mid);
     MergeSorted(arr,mid+1,end);
     
      Merge(arr,st,mid,end);  
    }
    public static void Merge(int arr[],int st,int mid,int end){
        int temp[]=new int[end-st+1];
        int i=st;//left side arr
        int j=mid+1;//right side arr
        int k=0;//temp arr pointer
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
              temp[k]=arr[i];
              i++;
            } 
        else{
            temp[k]=arr[j];
              j++;
        }
        k++;
        }
         //for those element who left at the end whether is it right part or left part
    while(i<=mid){
        temp[k++]=arr[i++];
    }

    //right part
     //for those element who left at the end whether is it right part or left part
    while(j<=end){
        temp[k++]=arr[j++];
    }
    //then copt temp to an original array
    for(k=0 ,i=st;k<temp.length;k++,i++){
        arr[i]=temp[k];//copy to an arry
    }
    }
   

    public static void main(String args[]){
    int arr[]={6,3,9,8,2,5};
     MergeSorted(arr,0,arr.length-1);
     printArr(arr);
    }
}