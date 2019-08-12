package collections;

import java.util.Comparator;
//
public class EmployeeSalaryComparator implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }

}
