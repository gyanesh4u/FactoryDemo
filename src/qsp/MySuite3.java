package qsp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Factory;

public class MySuite3 
{
	@Factory
public Object[] runTest() throws Exception
{
	String path="./TestSet.xlsx";
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	int rn=wb.getSheet("Sheet1").getLastRowNum();
	
	Object[] allTest=new Object[rn+1];
	for(int i=0;i<=rn;i++)
	{
		String tn=wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		Reporter.log(tn,true);
		Object obj = Class.forName(tn).newInstance();
		allTest[i]=obj;
	}
	return allTest;
}
}
