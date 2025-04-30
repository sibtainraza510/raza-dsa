package sortingsfolder;
import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,-4,3,1};
        selectionSort(arr);
        System.out.println( Arrays.toString(arr));
        
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastindex = arr.length-1-i;
            int maxarrindex =   maxindex( arr , lastindex);
            swap(arr, maxarrindex, lastindex);
          
        }
    }


        public static int maxindex(int[] arr ,int lastindex){
            int  max = 0;
            for(int i=0;i<=lastindex;i++){
                if(arr[max] < arr[i]){
                    max = i;
                }

            }

            return max;
        }

        public static void swap(int[] arr, int maxarrindex,int lastindex){
            int temp = arr[maxarrindex];
             arr[maxarrindex] = arr[lastindex];
             arr[lastindex] = temp;
        }

}
