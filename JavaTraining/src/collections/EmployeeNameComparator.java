package collections;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	private String attr;
	public EmployeeNameComparator(String attr){
		this.attr=attr;
	}
	//
	public int compare(Employee emp1, Employee emp2) {
		switch(attr){
		case "Name":
			return emp1.getName().compareTo(emp2.getName());
		case "Title":
			return emp1.getJobTitle().compareTo(emp2.getJobTitle());
			
		}
		return 0;
        
    }

}
