// package divideandconquerwithsorting;
// import java.util.*;
// public class quicksort{
// 	public static void main(String[] args) {
// 		int[] arr = {5,4,2,1};
// 		int low = 0;
// 		int high = arr.length-1;
// 		quicksorting(arr, low , high);
// 		System.err.println(Arrays.toString(arr));
// 	}

// 	public static void quicksorting(int[] arr,int low ,int high){

// 		if(low>=high){
// 			return;
// 		}
// 		int s = low;
// 		int e = high;
// 		int mid = s+(e-s)/2;
// 		int pivot = arr[mid];

// 		while(s<=e){
// 			while(arr[s] < pivot){
// 				s++;
// 			}

// 			while(arr[e] > pivot){
// 				e--;
// 			}

// 			if(s<=e){
// 				//swap;;
// 				int temp = arr[e];
// 				arr[e] = arr[s];
// 				arr[s] = temp;
// 				s++;
// 				e--;
// 			}
// 		}
// 		//forleft side;;
// 		quicksorting(arr, low, e);
// 		quicksorting(arr, s, high);

// 	}
// }



package divideandconquerwithsorting;
import java.util.*;
public class quicksort{
	public static void main(String[] args) {
		int[] arr = {5,4,2,1};
		int low = 0;
		int high = arr.length-1;
		quicksorting(arr, low , high);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] quicksorting(int[] arr,int low ,int high){

		if(low>=high){
			return arr;
		}
		int s = low;
		int e = high;
		int mid = s+(e-s)/2;
		int pivot = arr[mid];

		while(s<=e){
			while(arr[s] < pivot){
				s++;
			}

			while(arr[e] > pivot){
				e--;
			}

			if(s<=e){
				//swap;;
				int temp = arr[e];
				arr[e] = arr[s];
				arr[s] = temp;
				s++;
				e--;
			}
		}
		//forleft side;;
		 quicksorting(arr, low, e);
		return quicksorting(arr, s, high);

	}
}