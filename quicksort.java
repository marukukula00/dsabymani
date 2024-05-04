import java.util.Arrays;
public class quicksort {
    public static void main(String [] args){
        int[] arr={5,4,3,2,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return ;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int p=arr[m];
        if(s<=e){
        while(arr[s]<p){

        s++;
        }
        while(arr[e]>p){
    
        e--;
        }
        if(s<=e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
        }

    }
}
