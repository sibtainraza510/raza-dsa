package binarysearchfolder;

import java.util.Arrays;

public class binarysearch{
    // public static void main(String[] args){
    //     int[] arr = {1,2,3,4,5,6,7,8,9,10};
    //     int target = 10;
    //     System.out.println(binarySearch(arr,target));
    // }

    
    // public static int binarySearch(int[] arr, int target){
    //     int start = 0; int end = arr.length-1;
       
    //     while(start <=  end){
    //         int mid = start + (end-start)/2;
    //         if(target < arr[mid]){
    //             end = mid-1;
    //         }
    //         else if(target > arr[mid]){
    //             start = mid+1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }



    //binarysearch2D;
    public static void main(String[] args) {
        // int[][] arr = {{1,2}, {3,4}};
        int[][] arr = {
            {1,  3,  5},
            {7,  9, 11},
            {13, 15, 17}
        };
        int target = 11;
        // System.out.println(binarysearch2D(arr, target));
        System.out.println(Arrays.toString(binarysearch2D(arr, target)));

    }

    public static int[] binarysearch2D(int[][] arr , int target){
        int row = 0; int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[] {row,col};
            }
            if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }


        }
        return new int[] {-1,-1};

    }
}

