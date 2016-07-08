package basics;

class Test{
	String name;
	int age;
	
	void setName(String name){
		this.name=name;
	}
	void setAge(int age){
		this.age=age;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}

public class GetSetters {
	public static void main(String[] args){
		Test person=new Test();
		person.setInfo("NagarjunReddy", 30);
		System.out.println("Name is "+person.getName()+", Age is "+person.getAge());
	}

}
