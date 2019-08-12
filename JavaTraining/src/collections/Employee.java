package collections;

public class Employee {
	 private String name;
	    private String jobTitle;
	    private int age;
	    private int salary;
	 
	    public Employee(String name, String jobTitle, int age, int salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.age = age;
	        this.salary = salary;
	    }
	 
	    // getters and setters//
	    public void setName(String name){
	    	this.name=name;
	    }
	    public String getName(){
	    	return this.name;
	    }
	    
	    public void setJobTitle(String jobTitle){
	    	this.jobTitle=jobTitle;
	    }
	    public String getJobTitle(){
	    	return this.jobTitle;
	    }
	    
	    public void setAge(int age){
	    	this.age=age;
	    }
	    public int getAge(){
	    	return this.age;
	    }
	    
	    public void setSalary(int salary){
	    	this.salary=salary;
	    }
	    public int getSalary(){
	    	return this.salary;
	    }
	 
	    public String toString() {
	        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
	    }

}
