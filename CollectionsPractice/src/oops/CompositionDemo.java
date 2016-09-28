package oops;

public class CompositionDemo {
	String project;
	Employee emp;
	CompositionDemo(String project, Employee emp){
		this.project=project;
		this.emp=emp;
	}
	void display(){
		System.out.println("---Employee Details---");
		System.out.println("Project Name: "+project);
		System.out.println("Emp Name: "+emp.empName);
		System.out.println("Module: "+emp.module);
	}
	public static void main(String[] args){
		Employee emp = new Employee("Nagarjun Reddy K","Payments Process");
		CompositionDemo com = new CompositionDemo("XTBills",emp);
		com.display();
		new CompositionDemo("XTBills",new Employee("Chaitanya K","QBOnline Sync")).display();
		
	}
}

class Employee{
	String empName,module;
	Employee(String empName, String module){
		this.empName=empName;
		this.module=module;
	}
}
