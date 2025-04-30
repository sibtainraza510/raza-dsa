package recursionfolder;
import java.util.*;
public class recursionlevel2ques{
    // public static void main(String[] args) {
        // int[] arr= {1,2,3,40,3,5,2};
        // int index = 0; 
        // int index = arr.length-1;
        // int target = 3;
        // System.out.println(sortedornot(arr, index));
        // System.out.println(Find(arr,index,target));
        // System.out.println(Findindex(arr,index,target));
        // System.out.println(Findlastindex(arr,index,target));

        // Findallindex(arr, index, target);
        // System.out.println(list);

    // }


    //sortin ? yes or no;;
    // public static boolean sortedornot(int[] arr, int index){
    //     //base class;
    //     if(index == arr.length){
    //         return true;
    //     };

    //     return arr[index] < arr[index+1] && sortedornot(arr, index+1);

    // }

    //find element yes or no;
    // public static boolean Find(int[] arr ,int index , int target){
    //     //base class;
    //     if(index == arr.length){
    //         return false;
    //     }
    //     return arr[index] == target || Find(arr,index+1, target);
    // }

    //find index;
    // public static int Findindex(int[] arr,int index,int target){
    //     //base class;
    //     if(index == arr.length){
    //         return -1;
    //     }
    //     if(arr[index] == target){
    //         return index;
    //     }else{
    //         return Findindex(arr, index+1, target);
    //     }

    // }

    //find last index 
    // public static int Findlastindex(int[] arr,int index,int target){
    //     //base class;
    //     if(index == 0){
    //         return -1;
    //     }
    //     if(arr[index] == target){
    //         return index;
    //     }
    //     else{
    //         return Findlastindex(arr, index-1, target);
    //     }
    // }


    //all index using array list;;
    // static ArrayList<Integer> list = new ArrayList<>(100);
    // public static void Findallindex(int[] arr, int index, int target){
    //     // base class;
    //     if(index == arr.length){
    //         return ;
    //     }
    //     if(arr[index] == target){
    //         list.add(index);
    //     }

    //     Findallindex(arr, index+1, target);
    // }









    //all index using another array list method;;
    // public static void main(String[] args){
    //     int[] arr = {1,1,2,3,4,5,5,5,5};
    //     int target = 5;
    //     int index = 0;
    //     ArrayList<Integer> ans = findallindexusingarraylist(arr,target,index , new ArrayList<>());
    //     System.out.println(ans);
    // }

    // static ArrayList<Integer> findallindexusingarraylist(int[] arr, int target, int index, ArrayList<Integer> list) {
    //     if (index == arr.length) {
    //         return list;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     }
    //     return findallindexusingarraylist(arr, target, index + 1, list);
    // }


    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 1, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
    
}