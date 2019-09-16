package dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//
public class Utility {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static String[][] readXlsxFile(String filePath) throws IOException {
		// Creating a new file
		FileInputStream fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(workbook.getSheetIndex("Sheet1"));
		int rowCount = sheet.getLastRowNum()+1;
		int colCount =sheet.getRow(0).getLastCellNum();
		
		//System.out.println("Rows: "+rowCount+", Columns: "+colCount);

		String data[][] = new String[rowCount-1][colCount];

		for (int i = 0; i < rowCount-1; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i][j] =sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	
	
	
	
	
	
}
