package binarysearch;

public class orderagnosticbs {
    public static void main(String [] args){
int[] arr={34,45,67,88};
int ans=orderagnosticbs1(arr, 67);
System.out.println(ans);
    }
    static int orderagnosticbs1(int[] arr,int target){
int start=0;
int end=arr.length-1;
boolean asc=arr[start]<arr[end];
while(start<=end){
    int mid=start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(asc==true){
        if(arr[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    else{
        if(arr[mid]<target){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        }
    }
    return -1;
}
}