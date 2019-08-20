package comparison;

import java.util.Arrays;

public class ArraysCompare6 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5}; 
		
		Object[] objArray1 = {arr1};
	    Object[] objArray2 = {arr2};
	    
	    System.out.println(Arrays.equals(objArray1, objArray2));//false
	    System.out.println(Arrays.deepEquals(objArray1, objArray2));//true
	}

}
