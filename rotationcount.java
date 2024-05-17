package binarysearch;

public class rotationcount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int ans=countrotations(arr);
        System.out.println(ans);
    }
    static int countrotations(int[] arr){
        int pivot=findpivot(arr);
      
        int ans=pivot+1;
        return ans;
    }
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(start<mid&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
