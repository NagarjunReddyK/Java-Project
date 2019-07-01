package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMultipleAttributes2 {
	public static void main(String[] args) {
		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
		 
        List<Employee> listEmployees = new ArrayList<>();
 
        listEmployees.add(new Employee("Sudheer", "Developer", 45, 80000));
        listEmployees.add(new Employee("Balu", "Designer", 30, 75000));
        listEmployees.add(new Employee("Ashok", "Designer", 45, 134000));
        listEmployees.add(new Employee("Sandeep", "Programmer", 25, 60000));
        listEmployees.add(new Employee("Vasanth", "Designer", 45, 130000));
        listEmployees.add(new Employee("Ajay", "Programmer", 30, 52000));
        listEmployees.add(new Employee("Kiran", "Programmer", 25, 51000));
        listEmployees.add(new Employee("Alex", "Designer", 30, 120000));
        listEmployees.add(new Employee("Imran", "Programmer", 22, 30000));
        listEmployees.add(new Employee("Srinivas", "Developer", 28, 80000));
        listEmployees.add(new Employee("Rajkumar", "Developer", 35, 67000));
        listEmployees.add(new Employee("Harish", "Developer", 35, 140000));
        listEmployees.add(new Employee("Nagarjun", "Programmer", 32, 80000));
        listEmployees.add(new Employee("Vishnu", "Developer", 35, 99000));
        listEmployees.add(new Employee("Wes", "Designer", 30, 82000));
 
        /*System.out.println("*** Before sorting:");
 
        for (Employee emp : listEmployees) {
            System.out.println(emp);
        }*/
 
        Collections.sort(listEmployees, new EmployeeComparator());
 
        System.out.println("\n*** After sorting:");
 
        for (Employee emp : listEmployees) {
            System.out.println(emp);
        }
	}

}
