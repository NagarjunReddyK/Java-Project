package polymorphism;
//3. Overloading – Sequence of data type of arguments
public class Overloading3 {
	public void getInfo(String userName, int age){
		System.out.println("Sequence of Parameters is String, int: "+userName+", "+age);
	}
	public void getInfo(int age, String userName){
		System.out.println("Sequence of Parameters is int, String: "+age+", "+userName);
	}
	public static void main(String[] args) {
		Overloading3 obj=new Overloading3();
		obj.getInfo("User1", 30);
		obj.getInfo(32, "User2");
	}
}
