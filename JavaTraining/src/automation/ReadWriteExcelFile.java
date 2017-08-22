package automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadWriteExcelFile {
	
	public static void main(String[] args) throws IOException {
		String excelPath="D://Automation//Login.xlsx";
		FileInputStream fis=new FileInputStream(excelPath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowNum=sheet.getLastRowNum()+1;
		int colNum=sheet.getRow(0).getLastCellNum();
		System.out.println("Columns: "+colNum);
		String[][] data=new String[rowNum][colNum];
		for(int i=0;i<rowNum;i++){
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colNum;j++){
				XSSFCell cell=row.getCell(j);
				String value=cell.toString();
				data[i][j]=value;
				System.out.println(value);
			}
		}
		fis.close();
		
		//To write the data into Excel file
		sheet.getRow(0).createCell(2).setCellValue("Company Name");
		sheet.getRow(1).createCell(2).setCellValue("R22 QA Company");
		sheet.getRow(2).createCell(2).setCellValue("Express Pay");
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		workbook.write(fos);
		//To close the workbook and o/p stream
		workbook.close();
		fos.close();
		

	}

}
