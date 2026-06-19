package Sorting;

public class modifiedbinarySearch {
    public static int PrintIndx(int arr[],int st,int end,int target){
     if(st>end){
        return -1 ;
     }
       int mid=st+(end-st)/2;
     if(arr[mid]==target){
        return mid;
     }
     if(st<=end){
      
        //for line 1
    if(arr[st]<=arr[mid]){
            if(arr[st]<=target && arr[mid]>=target){
                return PrintIndx(arr, st, mid-1, target);
            }

        
        else{
            return PrintIndx(arr, mid+1, end, target);

        }
    }
        //line 2
        else{

        
        if(arr[mid]>=target && arr[end]<=target){
             return PrintIndx(arr, mid+1,end , target);

        }
        else{
 return PrintIndx(arr, st, mid-1, target);
        }
     
    }
}
        return -1;
    }
    public static void main(String args[]){
    int arr[]={3,4,5,6,0,1,2};
    int target=0;
   int index=PrintIndx(arr,0,arr.length-1,target);
   System.out.println("index is "+ index);
    }
   

    
}
