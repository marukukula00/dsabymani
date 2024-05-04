import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        // Copy remaining elements from the first array
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        // Copy remaining elements from the second array
        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
