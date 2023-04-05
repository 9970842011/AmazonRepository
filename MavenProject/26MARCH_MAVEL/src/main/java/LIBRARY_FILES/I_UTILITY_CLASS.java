package LIBRARY_FILES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class I_UTILITY_CLASS 
{
	
	//@AuthorName: Dhiraj
	//This method is use to get TestData from excel sheet
	//need to pass 2 inputs ie. 1. rowIndex, 2. CloumnIndex
	
	public static String getTestDta(int rowIndex,int CloumnIndex ) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Dhiraj\\eclipse-workspace\\26MARCH_MAVEL\\TEST_DATA\\DATA.xlsx");
	    Sheet Sh = WorkbookFactory.create(file).getSheet("DDF");
	    
	    String value = Sh.getRow(rowIndex).getCell(CloumnIndex).getStringCellValue();
	    return value;
 
	}
	
	    //@AuthorName: Dhiraj
		//This method is use to capture screenshot of webpage
		//need to pass 2 inputs:  1.webdriver object, 2. int TCID
	
	public static void CaputreScreenSHOT(WebDriver driver,int TESTcaseID) throws IOException 
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Dhiraj\\eclipse-workspace\\26MARCH_MAVEL\\SCREENshot"
				+ "\\TESTCASEID"+TESTcaseID+".jpg");
		
		FileHandler.copy(source, Destination);
		
       	// 2ND WAY FOR SAVE FILE IN LOCAL FOLDER(DRIVE)-->THIS METHOD OF APPIUM(appche poi)
	    //	FileUtils.copyDirectory(source, Destination);
		
	}
	
	         //@AuthorName: Dhiraj
			//This method is use to provide properties data to test class)
	        //(intial values i.e.mobnum,password,url
	
	public static String GetPropertyFileData(String key) throws IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Dhiraj\\eclipse-workspace\\"
				+ "26MARCH_MAVEL\\PROPERTY_FILE.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String value= prop.getProperty(key);
		
		return value;

	}

}
