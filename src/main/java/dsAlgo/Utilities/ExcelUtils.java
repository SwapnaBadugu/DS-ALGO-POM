package dsAlgo.Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dsAlgo.Entities.UserProfileInfo;

public class ExcelUtils {

	public static FileInputStream excelFile;
	public static XSSFWorkbook excelWorkBook;
	public static XSSFSheet excelWsheet;
	public static XSSFCell cell;
	public static XSSFRow row;


	// This method is to set the File path and to open the Excel file
	// Pass Excel Path and sheetname as Arguments to this method

	public static void setexcelFileInfo(String excel_File, String Sheetname) throws Exception {
		// Open excel file
		excelFile = new FileInputStream(excel_File);
		// Open excel workbook
		excelWorkBook = new XSSFWorkbook(excelFile);
		// Access the required test data sheet
		excelWsheet = excelWorkBook.getSheet(Sheetname);
		// System.out.println(ConfigProperties.excel_Path + " " +
		// ConfigProperties.excel_FileName + " " + Sheetname);
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = excelWsheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			String CellData = formatter.formatCellValue(cell);
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static UserProfileInfo getUserProfileFromExcel(String excel_File, String sheetname) throws Exception {
		try {
			setexcelFileInfo(excel_File, sheetname);

			UserProfileInfo userProfile = new UserProfileInfo();
			userProfile.username = getCellData(1, 0);
			userProfile.password = getCellData(1, 1);
			return userProfile;
		} catch (Exception e) {
			System.out.println("Error in reading cell Data - " + e.getMessage());
			return new UserProfileInfo();
		} finally {
			if (excelWorkBook != null)
				excelWorkBook.close();
			if (excelFile != null)
				excelFile.close();
		}

	}

}
