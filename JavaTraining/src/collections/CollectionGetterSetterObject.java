package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterObject {
	//private List<Person> listPeople;//
	private List<Person> listPeople=new ArrayList<Person>();
	
	/*public void setListPeople(List<Person> list){
		this.listPeople=new ArrayList<Person>(list);
	}
	
	public List<Person> getListPeople(){
		return new ArrayList<Person>(this.listPeople);
	}*/
	
	public void setListPeople(List<Person> list){
		for(Person aPerson:list){
			this.listPeople.add((Person) aPerson.clone());
		}
	}
	
	public List<Person> getListPeople(){
		List<Person> listReturn=new ArrayList<Person>();
		for(Person aPerson:this.listPeople){
			listReturn.add((Person) aPerson.clone());
		}
		return listReturn;
	}
	
	
	public static void main(String[] args) {
		CollectionGetterSetterObject app=new CollectionGetterSetterObject();
		List<Person> list1=new ArrayList<Person>();
		list1.add(new Person("Nagarjun Reddy"));
		list1.add(new Person("Murali"));
		list1.add(new Person("Chaitanya"));
		list1.add(new Person("Patel"));
		list1.add(new Person("Gowtham"));
		
		app.setListPeople(list1);
		System.out.println("People List1: "+list1);
		
		list1.get(2).setName("Rajitha");
		List<Person> list2 = app.getListPeople(); 
        System.out.println("People List2: " + list2);
        
        list1.get(0).setName("Ravi Kumar");
        List<Person> list3 = app.getListPeople(); 
        System.out.println("People List3: " + list3); 
		
	}

}

class Person { 
    private String name; 
   
    public Person(String name) { 
        this.name = name; 
    } 
   
    public String getName() { 
        return this.name; 
    } 
   
    public void setName(String name) { 
        this.name = name; 
    } 
   
    public String toString() { 
        return this.name; 
    }
    public Object clone(){
    	return new Person(this.name);
    }
}


/*So key points for implementing getter and setter for collection type are:
For collection of String objects: does not need any special tweak since String objects are immutable.
For collection of custom types of object:
Implement clone() method for the custom type.
For the setter, add cloned items from source collection to the destination one.
For the getter, create a new collection which is being returned. Add cloned items from the original collection to the new one.*/


















