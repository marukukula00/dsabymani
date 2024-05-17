package binarysearch;
/*
 * (leetcode) 53.Find Minimum in Rotated Sorted Array

(D-Medium)

Hint
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
 */

public class findmininrotatedsortedarr {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int ans=findMin(arr);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int pivot=findpivot(nums);
        int ans=nums[pivot+1];
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
            else if(start<mid&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[start]<arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
