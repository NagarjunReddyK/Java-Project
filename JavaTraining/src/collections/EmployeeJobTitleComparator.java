package collections;

import java.util.Comparator;
//
public class EmployeeJobTitleComparator implements Comparator<Employee>{
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getJobTitle().compareTo(emp2.getJobTitle());
    }
}
