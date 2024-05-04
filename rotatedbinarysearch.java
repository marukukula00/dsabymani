public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 8, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        
        if (arr[m] == target) {
            return m;
        }

        // Check which half of the array is sorted and perform binary search accordingly
        if (arr[s] <= arr[m]) {
            // Left half is sorted
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        } else {
            // Right half is sorted
            if (target >= arr[m] && target <= arr[e]) {
                return search(arr, target, m + 1, e);
            } else {
                return search(arr, target, s, m - 1);
            }
        }
    }
}
