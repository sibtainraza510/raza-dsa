package recursionfolder;

import java.util.*;

public class fibonacci {
    // public static void main(String[] args) {
    //     msg1();
    // }  
    
    // public static void msg1(){
    //     System.out.println("msg1");
    //     msg2();
    // }
    // public static void msg2(){
    //     System.out.println("msg2");
    // }

    // public static void main(String[] args) {
    //     System.out.println(fibo(8));
    // }

    // public static int fibo(int n){
    //     if(n<2){
    //         return n;
    //     }
    //     return fibo(n-1) + fibo(n-2);
    // }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int s = 0; int e = arr.length-1; 
        System.out.println(binaryques(arr,target , s , e ));
    }
    public static int binaryques(int[] arr, int target , int s , int e  ){
        int mid = s+(e-s)/2;
        if(s>e){
            return -1;
        }

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binaryques(arr, target, s , mid-1);
        }
        
        return binaryques(arr, target, mid+1, e);



    }

}



