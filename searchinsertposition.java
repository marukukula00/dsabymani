package binarysearch;
/*
 *(leetcode Q) 35. Search Insert Position

(D-Easy)
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
(this is similar approach to find the floorofno question)
 */
public class searchinsertposition {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int ans=searchInsert(arr, 2);
        System.out.println(ans);

        
    }
    static int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
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
