package LIBRARY_FILES;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H__BASE_CLASS_INITIAL 
{
	//BASE CLASS CONTAINS:-
	  //1.BROWSER OPEN CODE
	  //2.WEB PAGE OPEN CODE
	  //3.WAITS
	  //THE CODE WHICH WE HAVE USE MULTIPLE TIMES(AT THE INITIAL CONDITION)-->DIFF TEST CASES
	
	public WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhiraj\\eclipse-workspace\\"
		   		+ "26MARCH_MAVEL\\BROWSER_FILES\\chromedriver.exe");
	       driver =new ChromeDriver();
	       
	       driver.get(I_UTILITY_CLASS.GetPropertyFileData("URL"));
	       driver.manage().window().maximize();		
	       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

}
