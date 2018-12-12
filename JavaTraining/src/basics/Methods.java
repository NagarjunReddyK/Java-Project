package basics;

class Person1{
	String name;
	int age;
	
	void sayHello(){
		System.out.println("Hello there!");
	}
	
	void speak(){
		System.out.println("My Name is "+name+" and I am "+age+" years old.");
	}
	
	int yearsToRetirement(){
		int yearsLeft=65-age;
		return yearsLeft;
	}
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	
}

public class Methods {
	public static void main(String[] args){
		Person1 person1=new Person1();
		person1.name="Nagarjun Reddy";
		person1.age=30;
		person1.sayHello();
		person1.speak();
		
		int years=person1.yearsToRetirement();
		System.out.println("Years left to retirment: "+years);
		
		String name=person1.getName();
		int age=person1.getAge();
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		
	}

}
