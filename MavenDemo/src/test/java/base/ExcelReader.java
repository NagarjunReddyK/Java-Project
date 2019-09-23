package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testdata.Login;
import testdata.Vendors;

public class ExcelReader {
	public String path;
	public FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;

	public ExcelReader(String path) throws IOException {
		this.path = path;
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
	}

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		int count = sheet.getLastRowNum() + 1;
		return count;
	}

	public int getRowNo(String sheetName, String TestcaseName) {
		try {
			int index = workbook.getSheetIndex(sheetName);
			int row_Num = 0;
			sheet = workbook.getSheetAt(index);
			int rowCount = getRowCount(sheetName);
			for (int i = 0; i < rowCount; i++) {
				cell = sheet.getRow(i).getCell(0);
				if (!cell.getStringCellValue().equals("")) {
					if (cell.getStringCellValue().trim().equals(TestcaseName.trim())) {
						row_Num = i;
					}
				}
			}
			return row_Num;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public String getCellData(String sheetName, String colName, int rowNum) {
		int index = workbook.getSheetIndex(sheetName);
		int col_Num = 0;
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
				col_Num = i;
				break;
			}
		}
		row = sheet.getRow(rowNum);
		if (row == null)
			return "";
		cell = row.getCell(col_Num);

		if (cell == null)
			return "";

		return cell.getStringCellValue();
	}

	public int getRowCount(String sheetName, String colName, String methodName) {
		ArrayList<Integer> rows = new ArrayList<>();
		for (int i = 1; i < getRowCount(sheetName); i++) {
			String tcid = getCellData(sheetName, colName, i);
			if (tcid.equals(methodName)) {
				rows.add(i);
			}
		}
		return rows.size();
	}

	public int getFirstDataRowNum(String sheetName, String colName, String methodName) {
		for (int i = 1; i < getRowCount(sheetName); i++) {
			String tcid = getCellData(sheetName, colName, i);
			if (tcid.equals(methodName)) {
				return i;
			}
		}
		return -1;
	}

	public Object[][] getData(String sheetName, String colName, String methodName) {
		int rowCount = getRowCount(sheetName, colName, methodName);
		int colCount = sheet.getRow(0).getLastCellNum();
		Object data[][] = new Object[rowCount][colCount];

		int firstRow = getFirstDataRowNum(sheetName, colName, methodName);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (!sheet.getRow(firstRow + i).getCell(j).getStringCellValue().equals(""))
					data[i][j] = sheet.getRow(firstRow + i).getCell(j).getStringCellValue();
				else
					data[i][j] = "";
			}
		}
		return data;
	}

	public ArrayList<Login> getExcelData(String sheetName, String colName, String methodName) {
		int rowCount = getRowCount(sheetName, colName, methodName);
		int colCount = sheet.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount][colCount];
		ArrayList<Login> list = new ArrayList<Login>();
		int firstRow = getFirstDataRowNum(sheetName, colName, methodName);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (!sheet.getRow(firstRow + i).getCell(j).getStringCellValue().equals(""))
					data[i][j] = sheet.getRow(firstRow + i).getCell(j).getStringCellValue();
				else
					data[i][j] = "";
			}
			list.add(new Login(data[i][0], data[i][1], data[i][2]));
		}
		return list;
	}

	public List<Vendors> getVendorExcelData(String sheetName, String colName, String methodName) {
		int rowCount = getRowCount(sheetName, colName, methodName);
		int colCount = sheet.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount][colCount];
		List<Vendors> vendors = new ArrayList<Vendors>();
		int firstRow = getFirstDataRowNum(sheetName, colName, methodName);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (!sheet.getRow(firstRow + i).getCell(j).getStringCellValue().equals(""))
					data[i][j] = sheet.getRow(firstRow + i).getCell(j).getStringCellValue();
				else
					data[i][j] = "";
			}
			vendors.add(new Vendors(data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5],data[i][6]));
		}
		return vendors;
	}

}
