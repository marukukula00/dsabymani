package binarysearch;

public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 111, 222, 333, 444, 555, 666, 777};
        int ans = ans(arr, 666);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        
        // Find the range where the target might exist
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
            
            // Check if the new end index exceeds the array length
            if (end >= arr.length) {
                end = arr.length - 1; // Set end to the last index of the array
                break;
            }
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
