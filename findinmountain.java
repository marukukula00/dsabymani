package binarysearch;

public class findinmountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2,1};
        int ans=search(arr, 4);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int peak=findpeakindex(arr);
        int firsttry=orderagnosticbs1(arr, target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        
            return  orderagnosticbs1(null, target, peak, arr.length-1);
        
        
    }
    static int findpeakindex(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderagnosticbs1(int[] arr,int target,int start,int end){
        
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
