package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileData 
{
	public static String fetchDataFromExcel(int i, int j) throws EncryptedDocumentException, IOException
	{
		String data="";
		
		String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"Java Fetching Sheet Data.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet s = WorkbookFactory.create(file).getSheet("Test Data");
		Cell c = s.getRow(i).getCell(j);
		CellType type = c.getCellType();
		
		if (type==CellType.STRING)
		{
			data = c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC)
		{
			double number = c.getNumericCellValue();
			data = Double.toString(number);
//			data = String.valueOf(number);
		}
		else if(type==CellType.BLANK)
		{
			data = "";
		}
		
		return data;
	}
}
