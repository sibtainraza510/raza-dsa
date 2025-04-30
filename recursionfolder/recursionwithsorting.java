package recursionfolder;
import java.util.*;
public class recursionwithsorting{
    // public static void main(String[] args) {
    //     int[] arr = {5,4,3,2,1};
    //     int size = arr.length-1;
    //     int index = 0;
    //     recursionbubblesorting(arr, size, index);

    //     System.out.println(Arrays.toString(arr));
    // }
    // public static void recursionbubblesorting(int[] arr , int size, int index){
    //     if(size == 0){
    //         return;
    //     }
    //     if(size > index){
    //         if(arr[index] > arr[index+1]){
    //             //swap;
    //             int temp = arr[index+1];
    //             arr[index+1] = arr[index];
    //             arr[index] = temp;
    //         }
    //          recursionbubblesorting(arr, size, index+1);
    //     }else{
    //         recursionbubblesorting(arr, size-1, 0);

    //     }
    
    // }


    public static void main(String[] args) {
                int[] arr = {1, 4, 3, 5};
                recursionselectionsorting(arr, arr.length, 0, 0);
                System.out.println(Arrays.toString(arr));
            }

            static void recursionselectionsorting(int[] arr, int r, int c, int max) {
                if (r == 0) {
                    return;
                }
                if (c < r) {
                    if (arr[c] > arr[max]) {
                        recursionselectionsorting(arr, r, c+1, c);
                    } else {
                        recursionselectionsorting(arr, r, c+1, max);
                    }
                } else {
                    int temp = arr[max];
                    arr[max] = arr[r-1];
                    arr[r-1] = temp;
                    recursionselectionsorting(arr, r-1, 0, 0);
                }
            }
}