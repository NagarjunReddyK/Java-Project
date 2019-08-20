package comparison;

import java.util.Arrays;
//Object arrays comparison with equals() and deepEquals()
public class ArraysCompare5 {
	public static void main(String[] args) {
		Object[] o1={"username","password"};
		Object[] o2={"username","password"};
		
		System.out.println(Arrays.equals(o1, o2));//true
		
		
		Object[] ob1={"username",new String[]{"password"}};
		Object[] ob2={"username",new String[]{"password"}};
		
		System.out.println(Arrays.equals(ob1, ob2));//false
		System.out.println(Arrays.deepEquals(ob1, ob2));//true
	}
}
