/*package binarysearch;

public class twodSortedMatrix {
    public static void main(String[] args) {
        
    }
    static int[] binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while (cstart<=cend) {
            int cmid=cstart+(cend-cstart)/2;
            if(target==matrix[row][cmid])
            {
                return new int[]{row,cmid};
            }
        
            else if(matrix[row][cmid]>target){
                cend=cmid-1;
            }
            else{
                cstart=cmid+1;
            }
        }
        return new int[] {-1,-1};
    }
        static int[] search(int[][] matrix,int target){
          int row=matrix.length;
          int col=matrix[0].length;
          if(row==1){

          }
          int rstart=0;
          int rend=row-1;
          int cmid=col/2;
          while(rstart<rend-1){
int mid=rstart+(rend-rstart)/2;
if(matrix[mid][cmid]==target){

}
          }

        }
    
}
*/
//we need to complete basicTwodbinarysearchbinarysearch