package inheritance;

class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
}


public class InheritanceQ1 {
	public static void main(String[] args) {
		Employee e=new Employee();
		Manager m=new Manager();
		Director d=new Director();
		//Line-1
		e.salary=50_000;
		d.salary=65_000;
	//	e.budget= 2_00_000; 
		m.budget=1_00_000;
		//m.stockOptions= 500;
		d.stockOptions=1_000;
		
		
	}
}

/*
which two options fail to compile when placed at line-1 of the main code

A. e.salary=50000;
B. d.salary=65000;
C. e.budget= 200000; 
D. m.budget=100000;
E. m.stockOptions= 500;
F. d.stockOptions=1000;

*/