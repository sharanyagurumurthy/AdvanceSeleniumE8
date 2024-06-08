package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethods {

	public String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/testdatae8C/prope8.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getDataFromExcelFile(String sheetname,int rowNum,int colNum) throws IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/testdatae8C/exceldatae8.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
        Sheet sheet=wb.getSheet(sheetname);
        return sheet.getRow(rowNum).getCell(colNum).toString();
	}
	
	public static String getCurrentTime()
	{
		LocalDateTime l= LocalDateTime.now();
		String name = l.toString().replace(":", "-");
		return name;
	}
}
