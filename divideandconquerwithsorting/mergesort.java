package divideandconquerwithsorting;
import java.util.*;
public class mergesort {
	public static void main(String[] args) {
		int[] arr = {5,3,2,1};
		int start =0;
		int end = arr.length;
		arr = mergesorting( arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] mergesorting(int[] arr ){
		if(arr.length == 1){
			return arr;
		}
		int mid = arr.length/2;

		int[] left = mergesorting( Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergesorting(Arrays.copyOfRange(arr, mid, arr.length));
		return mergeboth(left, right);

	}

	public static int[] mergeboth(int[] left, int[] right){
		int[] mix = new int[left.length+ right.length];

		int i = 0;
		int j= 0;
		int k = 0;

		while(i<left.length && j<right.length){
			if(left[i] > right[j]){
				mix[k] = right[j];
				j++;
			}
			else{
				mix[k] = left[i];
				i++;
			}

			k++;
		}

		while(i<left.length){
			mix[k] = left[i];
			i++;
			k++;

		}

		while(j<right.length){
			mix[k] = right[j];
			k++;
			j++;
		}

		return mix;
		

	}
	
}
