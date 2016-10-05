package basics;

public class DataTypes {
	public static void main(String[] args) {
		// Primitive Data types
		byte b = 10;
		short s = 20;
		int i = 100;
		long l = 200;
		float flt = 10.5f; // or using type casting (float)10.5
		double dbl = 50.75;
		char ch = 'K';
		boolean bl = true;

		System.out.println("Byte value: " + b);
		System.out.println("short value: " + s);
		System.out.println("int value: " + i);
		System.out.println("long value: " + l);
		System.out.println("float value: " + flt);
		System.out.println("double value: " + dbl);
		System.out.println("char value: " + ch);
		System.out.println("boolean value: " + bl);

		// Reference Data types
		String str = "Java Basics";
		System.out.println("String value: " + str);
	}
}
