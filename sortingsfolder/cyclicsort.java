package sortingsfolder;

import java.util.Arrays;

public class cyclicsort {
    // public static void main(String[] args) {
    //     int[] arr = {5,4,3,2,1};
    //     System.out.println(Arrays.toString(cyclicSort(arr))  );
    // } 

    // public static int[] cyclicSort(int[] arr){
    //     int i=0;
    //     while(i < arr.length){
    //         int correctidx = arr[i]-1;
    //         if(arr[i] != arr[correctidx]){
    //             int temp = arr[i];
    //             arr[i] = arr[correctidx];
    //             arr[correctidx] = temp;
    //         }else{
    //             i++;
    //         }
    //     }

    //     return arr;
    // }



//single missing number;;
    // public static void main(String[] args) {
    //     int[] arr = {5,4,3,2,0};
    //     System.out.println(cyclicSortmissingnumberone(arr));
    // } 

    // public static int cyclicSortmissingnumberone(int[] arr){
    //     int i=0;
    //     while(i < arr.length){
    //         int correctidx = arr[i];
    //         if(  arr[i] < arr.length &&  arr[i] != arr[correctidx]){
    //             int temp = arr[i];
    //             arr[i] = arr[correctidx];
    //             arr[correctidx] = temp;
    //         }else{
    //             i++;
    //         }
    //     }

    //     for(int index = 0; index<arr.length;index++){
    //         if(arr[index] != index){
    //             return index;
    //         }
    //     }

    //     return arr.length;

    // }


//multiple missing number;;

    // public static void main(String[] args){
    //     int[] arr = {4,3,2,7,8,2,3,1};
    //     System.out.println(multiplemissingnumber(arr));
    // }
    
    // public static int multiplemissingnumber(int[] arr){
    //     int i = 0;
    //     while(i<arr.length){
    //         int correctindex = arr[i]-1;
    //         if(arr[i] != arr[correctindex]){
    //             int temp = arr[i];
    //             arr[i] = arr[correctindex];
    //             arr[correctindex] = temp;
    //         }else{
    //             i++;
    //         }
    //     }

    //     for(int index = 0; index < arr.length; index++){
    //         if(arr[index] != index+1 ){
    //             System.out.println(index+1);
    //         }
    //     }
        
    //     return arr.length;
    // }
}
 