import java.util.*;

public class linearsearch{

    // public static int linearSearch(int[] arr, int target){
    //     for(int i=0;i<arr.length;i++){

    //         if(arr[i] == target){
    //            return i;
    //         }
    //     }
    //     return -1;
    
    // }


    // public static int linearSearch(int[] arr, int target){
        // for(int i=0;i<arr.length;i++){

        //     if(arr[i] == target){
        //        return true;
        //     }
        // }
        // return false;

    //     for(int element : arr){
    //         if(element == target){
    //             return element;
    //         }
    //     }
    //     return -1;
    
    // }

    // public static void main(String[] args){
    //     int[] arr = {10,20,24,30,40};
    //     int target = 4;
    //     System.out.println(linearSearch(arr, target));

    // }



    //minvaluein array;

    // public static void main(String[] args) {
    //     int[] arr = {10,9,8,7,6};
    //     System.out.print(minvalue(arr));
    // }

    // public static int minvalue(int[] arr){
    //     int max = arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]<max){
    //             max = arr[i];
    //         }
            
    //     }
    //     return max;
    // }



    //stringsearch
    // public static void main(String[] args) {
    //     String str = "muhammad raza";
    //     char s = 'o';
    //     System.out.println(stringsearch(str, s));
    // }

    // public static int stringsearch(String str, char s){
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i) == s){
    //             return i;

    //         }

    //     }
    //     return -1;
    // }



    //array2D search;

    // public static void main(String[] args){
    //     int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9,0}};
    //     int target = 50;
    //     System.out.println(Arrays.toString(array2dsearch(arr, target)));
    // }

    // public static int[] array2dsearch(int[][] arr, int target){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(arr[i][j] == target){
                    // return arr[i][j]; not work in 2d arrays ****************************
                    // return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

    // }



    // //minormax in 2darrays;
    // public static void main(String[] args) {
    //     int[][] arr = {{2,3},{4,5,6},{7,8,9}};
    //     System.out.println(min(arr));
    // }

    // public static int min(int[][] arr){
    //     int min = arr[0][0];
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr[i].length;j++){
    //             if(min > arr[i][j]){
    //                 min = arr[i][j];
    //             }
    //         }
    //     }
    //     return min;
    // }



    /// evendigits in array;
    // public static void main(String[] args) {
    //     int[] arr  = {1,4,29,54,10};
    //     System.out.println(evendigits(arr));
    // }

    // public static int evendigits(int[] arr){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(  (String.valueOf(arr[i]).length())  %2 == 0  ){
    //             count= count+1;
    //         }
    //     }
    //     return count;
    // }

    // public static int evendigits(int[] arr){
    //     int digit = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int digits = countdigits(arr[i]);
    //         if(digits%2 == 0){
    //             digit = digit+1;
    //         }

    //     }
    //     return digit;
    // }

    // public static int countdigits(int num){
    //     int count = 0;
    //     if(num == 1){
    //         return 1;
    //     }
    //     while(num>0){
    //         count = count+1;
    //         num = num/10;
    //     }

    //     return count;

    // }


  

}