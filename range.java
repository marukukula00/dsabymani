package binarysearch;

import java.util.Arrays;

public class range {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] ans = searchRange(nums, 7);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = binarysearch(nums, target, true);
        int end = binarysearch(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int binarysearch(int[] nums, int target, boolean findfirstindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findfirstindex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
