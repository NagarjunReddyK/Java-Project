package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetter {
	private List<String> columns;
	
	// the collection can be modified from code outside of the getter and setter
	/*public void setColumns(List<String> columns){
		this.columns=columns;
	}
	
	public List<String> getColumns(){
		return this.columns;
	}*/
	
	
	//For a collection of Strings, one solution is to use the constructor that takes another collection as argument
	public void setColumns(List<String> columns){
		this.columns=new ArrayList<String>(columns);
	}
	
	public List<String> getColumns(){
		return new ArrayList<String>(this.columns);
	}
	
	public static void main(String[] args) {
		CollectionGetterSetter app=new CollectionGetterSetter();
		List<String> columns=new ArrayList<String>();
		columns.add("Vendor Name");
		columns.add("Bill Number");
		columns.add("Status");
		columns.add("Description");
		
		app.setColumns(columns);
		System.out.println("Columns are: "+columns);
		
		columns.set(2, "Email");
		List<String> columns2=app.getColumns();
		System.out.println("Columns2 are: "+columns2);
		
		columns.set(3, "Address");
		List<String> columns3=app.getColumns();
		System.out.println("Columns3 are: "+columns3);
	}

}
