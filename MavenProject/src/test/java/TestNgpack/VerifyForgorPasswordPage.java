package TestNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.ForgotPasswordPage;
import Page.LoginPage;

public class VerifyForgorPasswordPage {
	
	WebDriver driver;
	LoginPage loginPage;
	ForgotPasswordPage forgotPasswordPage;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSetup\\Chrome111\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");	
		
		driver=new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.facebook.com");
		
		loginPage = new LoginPage(driver);
		loginPage.clickOnForgottenButton();
		
		forgotPasswordPage = new ForgotPasswordPage(driver);
				
		
	}
	
	@Test
	public void VerifyMessageOnForgotPasswordPage()
	{
		System.out.println("Test1");
		String actualmsg = forgotPasswordPage.getText(); 
		
		String expectedmsg = "Please enter your email address or mobile number to search for your account.";
		
		if(actualmsg.equals(expectedmsg))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}

	
	
	@Test
	public void VerifyCancelButtonOnForgotPasswordPage()
	{
		System.out.println("Test2");
		forgotPasswordPage.clickOnCancelButton();
		
		String actualtitle=driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		String expectedtitle="Log in to Facebook";
		String expectedurl="https://www.facebook.com/login.php";
		
		if(actualtitle.equals(expectedtitle) && actualurl.equals(expectedurl))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		
	}
	
	
	@AfterClass
	public void afterclass()
	{
		//driver.quit();
		
	}
}
