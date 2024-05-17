package binarysearch;

/**
 * (leetcode)154. Find Minimum in Rotated Sorted Array II(in the question we have duplicate elements so we need to use duplicate pivot algorithm and find min)

Hard

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.
 * 
 */
public class findminrotatedsortedarrII {
public static void main(String[] args) {
    int[] arr={2,2,2,0,1};
    int ans=findMin(arr);
    System.out.println(ans);
}

    public static int findMin(int[] nums) {
        int pivot =findpivot(nums);
        
        if(pivot<=nums.length-1){
        return nums[pivot+1];
        }
        return nums[0];
    }
    public static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(end>mid&&arr[mid]>arr[mid+1]){
                return mid;
            }
             if(start<mid&&arr[mid]<arr[mid-1]){
                return mid-1;
             }
           
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                if(start<end&&arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(end>start&&arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
    
