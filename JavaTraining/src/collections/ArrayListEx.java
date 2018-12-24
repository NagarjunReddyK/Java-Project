package collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		Vendr v = null;
		ArrayList<Vendr> al1 = new ArrayList<Vendr>();
		for(int i=1;i<=10;i++){
			v=new Vendr(i,"Vendor"+i);
			al1.add(v);
		}
		
		for(Vendr vn:al1)
			System.out.println(vn.vendorID+"---"+vn.vendorName);
	}
}

class Vendr{
	int vendorID;
	String vendorName;
	Vendr(int vendorID, String vendorName){
		this.vendorID=vendorID;
		this.vendorName=vendorName;
	}
}
