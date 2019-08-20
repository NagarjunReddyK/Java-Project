package comparison;

import java.util.Arrays;
//Two dimensional array
public class ArraysCompare4 {
	public static void main(String[] args) {
		String[][] arr1={{"username","password"},{"login","home"}};
		String[][] arr2={{"username","password"},{"login","home"}};
		
		String[][] arr3={{"password","username"},{"login","home"}};
		
		System.out.println(Arrays.equals(arr1, arr2));//false
		System.out.println(Arrays.equals(arr1, arr3));//false
		
		System.out.println(Arrays.deepEquals(arr1, arr2));//true
		System.out.println(Arrays.deepEquals(arr1, arr3));//false
		
	}

}
