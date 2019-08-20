package comparison;

import java.util.Arrays;

public class ArraysCompare1 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5}; 
		int[] arr3 = {1,2,5,4,3};

		System.out.println(Arrays.equals(arr1, arr2));//true
		System.out.println(Arrays.equals(arr1, arr3));//false
		

	}
}
