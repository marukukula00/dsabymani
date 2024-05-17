package binarysearch;

/**
 in this oquestion we will solve and find the ceil of a number. ex:- if we given 5 to find target. if target is there we will return .if target is not there we will return ceil(the number should be small in the array but greater than the target) of that number
 */
public class ceilofno {
public static void main(String [] args){
int[] arr={22,23,24,26,29};
int ans=findceil(arr, 25);
System.out.println(ans);
}
/**
 * @param arr
 * @param target
 * @return
 */
static int findceil(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    int mid;
    while(start<=end){
         mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return start;
}
    
}