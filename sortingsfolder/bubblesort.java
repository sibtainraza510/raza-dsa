package sortingsfolder;

import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,-1};
        System.out.println(  Arrays.toString(bubbleSort(arr))   );
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for( int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                //swap;
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
            }
        }
        return arr;
    }
} 