package basics;

class Person{
	String name;
	int age;
}

public class ClassObj {
	public static void main(String[] args){
		Person person1=new Person();
		person1.name="Nagarjun Reddy";
		person1.age=30;
		
		Person person2=new Person();
		person2.name="asdfghijkl";
		person2.age=35;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		
	}

}
