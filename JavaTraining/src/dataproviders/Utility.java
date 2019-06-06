package dataproviders;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Utility {

	public static String[][] readXlsFile(String fileName) throws BiffException, IOException {

		// Creating a new file

		File srcFile = new File(fileName);
		System.out.println(srcFile.getAbsolutePath());

		// Read the workbook in src file
		Workbook wb = Workbook.getWorkbook(srcFile);

		Sheet sheet = wb.getSheet(0);

		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		// Array
		String data[][] = new String[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell cell = sheet.getCell(j, i);
				data[i][j] = cell.getContents();

			}
		}
		return data;

	}

}
