package binarysearch;
/*
 * (LEETCODE)33. Search in Rotated Sorted Array

(level of diffcult-Medium)
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
 */
public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int ans=search(arr, 0);
        System.out.println(ans);
        System.out.println(findpivot(arr));
    }
    static int search(int [] arr,int target){
        int pivot=findpivot(arr);
        if(pivot==-1){
            return index(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return index(arr, target, 0, pivot-1);
        }
        return index(arr, target, pivot+1, arr.length-1);
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
    static int index(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
