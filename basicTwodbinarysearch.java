package binarysearch;
import java.util.Arrays;
class basicTwodbinarysearchbinarysearch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final int[][] matrix={{10,20,30,40},
                      {15,25,35,45},
                      {28,29,37,49},
                     {33,34,48,50}};
                     int[] ans=binarysearch(matrix,37);
                     System.out.println(Arrays.toString(ans));
        }
    
    static int[] binarysearch(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length&&c>=0){
            if(target==arr[r][c]){
                return new int[]{r,c};
            }
            if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}