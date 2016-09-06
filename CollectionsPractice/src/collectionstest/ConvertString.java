package collectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertString {
	public ArrayList<String> getOptions(String str){
		ArrayList<String> options=new ArrayList<String>(Arrays.asList(str.split("\\s*,\\s*")));
		/*for(int i=0;i<options.size();i++){
			System.out.println(options.get(i));
		}*/
		return options;
	}
	public static void main(String[] args){
		ConvertString aList=new ConvertString();
		ArrayList<String> list=aList.getOptions("Approve,Delete,Cancel");
		ArrayList<String> app=new ArrayList<String>();
		app.add("Delete");
		app.add("Approve");
		app.add("Cancel");
		System.out.println(list+" --- "+app);
		List<String> abc=ArrayListCompare.equalLists(list, app);
		System.out.println(abc);
	}

}
