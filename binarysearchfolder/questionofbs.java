package binarysearchfolder;
import java.util.*;

// public class questionofbs{
// 	public static void main (String[] args){
// 		int[] arr = {1,2,3,4,5,6,7,9,10};
// 		int target = 8;
// 		System.out.println(ceiling(arr,target));

// 	}

// 	public static int ceiling(int[] arr, int target){
// 		if(target > arr[arr.length-1]){
// 			return -1;
// 		}

// 		int start = 0;
// 		int end = arr.length-1;
// 		while (start<=end) {
// 			int mid = start + (end-start)/2;
// 			if(target > arr[mid]){
// 				start = mid+1;
// 			}
// 			else if(target < arr[mid]){
// 				end = mid-1;
// 			}else{
// 				return mid;
// 			}
// 		}

// 		return start;
// 	}
// }






//floor;;
// public class questionofbs{
// 	public static void main (String[] args){
// 		int[] arr = {1,2,3,4,5,6,7,9,10};
// 		int target = 8;
// 		System.out.println(flooring(arr,target));

// 	}

// 	public static int flooring(int[] arr, int target){
// 		if(target > arr[arr.length-1]){
// 			return -1;
// 		}

// 		int start = 0;
// 		int end = arr.length-1;
// 		while (start<=end) {
// 			int mid = start + (end-start)/2;
// 			if(target > arr[mid]){
// 				start = mid+1;
// 			}
// 			else if(target < arr[mid]){
// 				end = mid-1;
// 			}else{
// 				return mid;
// 			}
// 		}

// 		return end;
// 	}
// }




//for characters using ceiling;;
// public class questionofbs{
// 	public static void main(String[] args) {
// 		char[] arr = {'a','b','c'};
// 		char target = 'a';
// 		System.out.println(charceiling(arr,target));		
// 	}

// 	public static char charceiling(char[] arr, char target){
// 		int start = 0;
// 		int end = arr.length-1;
// 		while (start<=end) {
// 			int mid = start + (end-start)/2;
// 			if(target < arr[mid]){
// 				end = mid-1;
// 			}else{
// 				start = mid+1;
// 			}
			
// 		}

// 		return arr[start%arr.length];

// 	}
// }





//find peak element in ascending+descending array;;
// public class questionofbs{
// 	public static void main(String[] args) {
// 		int[] arr = {1,2,3,4,5,4,3,2,1};
// 		System.out.println(peek(arr));
// 	}

// 	public static int peek(int[] arr){
// 		int start = 0;
// 		int end =  arr.length-1;
// 		while(start < end){
// 			int mid = start + (end-start)/2;

// 			if(arr[mid] > arr[mid+1]){    //in descending
// 				end = mid;
// 			}else{
// 				start = mid+1;
// 			}

// 		}

// 		return start;


// 	}
// }




//binary search for asc or des both;;
// public class questionofbs{
// 	public static void main(String[] args) {
// 		// int[] arr =  {99, 80, 75, 22, 11, 10, 5, 2, -3};
// 		int[] arr = {10,20,30,40,50};
// 		int target = 20;
// 		System.out.println(ascordes(arr,target));
// 	}

// 	public static int ascordes(int[] arr , int target){
// 		int start = 0;
// 		int end = arr.length-1;
// 		boolean isasc = arr[start] < arr[end];

// 		while(start <= end){
// 			int mid = start + (end-start)/2;
// 			if(isasc == true){
// 				if(target > arr[mid]){
// 					start = mid+1;
// 				}else if(target < arr[mid]){
// 					end = mid-1;

// 				}else{
// 					return mid;
// 				}
// 			}
// 			else{
// 				if(target > arr[mid]){
// 					end = mid-1;
// 				}else if(target < arr[mid]){
					
// 					start = mid+1;

// 				}else{
// 					return mid;
// 				}
// 			}
// 		}

// 		return -1;
// 	}
// }



//find target in binry search in asc+des array;;
public class questionofbs{
	public static void main(String[] args){
		int[] arr = {1,2,3,5,10,7,4,3,2,1};
		int target = 5;
		int peak = peakelement(arr);
		int ascordes1 = ascordes(arr,target, 0,peak);
		if(ascordes1 != -1){
			System.out.println(ascordes1);
		}else{
		System.out.println(ascordes(arr,target,peak+1,arr.length-1)); 
		}
	}

	public static int peakelement(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start < end){
			int  mid = start + (end-start)/2;
			if(arr[mid] > arr[mid+1]){
				//des order;
				end = mid;
			}else{
				start = mid+1;
			}
		}

		return start;

	}


	public static int ascordes(int[] arr , int target, int start , int end ){
		boolean isasc = arr[start] < arr[end];
		while (start <= end) {
			int  mid = start+ (end-start)/2;
			if(isasc == true){
				if(target > arr[mid]){
					start = mid+1;
				}else if(target < arr[mid]){
					end = mid-1;

				}
				else{
					return mid;	
				}

			}
			else{

				if(target > arr[mid]){
					end = mid-1;
				}else if(target < arr[mid]){
					
					start = mid+1;

				}
				else{
					return mid;	
				}
			}	
		}

		return -1;



	}

}



