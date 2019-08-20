package comparison;

import java.util.Arrays;

public class ArraysCompare2 {
	
	public static void main(String[] args) {
		String[] arr1={"username","password","login"};
		String[] arr2={"username","password","login"};
		String[] arr3={"password","username","login"};
		
		System.out.println(Arrays.equals(arr1, arr2));//true
		System.out.println(Arrays.equals(arr1, arr3));//false
	}

}
