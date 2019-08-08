package sorting;

public class Vendor implements Comparable<Vendor>{
	int vendorId;
	String vendorName;
	Vendor(int vendorId,String vendorName){
		this.vendorId=vendorId;
		this.vendorName=vendorName;
	}
	
	// To sort based on vendorId
	/*public int compareTo(Vendor v) {
		return vendorId-v.vendorId;
	}
	*/
	//To sort based on vendorName
	public int compareTo(Vendor v) {
		return vendorName.compareTo(v.vendorName);
	}

}
