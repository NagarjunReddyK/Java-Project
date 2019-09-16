package testsuite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\CSV_Data2.csv")); //CSV_Data.csv
		String rowData=null;
		while((rowData=br.readLine())!=null){
			System.out.println("Row Data: "+rowData);
			String[] str=rowData.split(",");
			for(String s:str)
				System.out.println(s);
		}
		if(br!=null)
			br.close();
	}

}
