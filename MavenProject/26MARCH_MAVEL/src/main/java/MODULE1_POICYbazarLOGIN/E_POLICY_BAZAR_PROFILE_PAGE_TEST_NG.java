package MODULE1_POICYbazarLOGIN;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG 

{
	@FindBy(xpath="//div[@class='sc-ckVGcZ kWpXlQ']") private WebElement Profilename;
	WebDriver driver1;
	 
	public E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void Switch_Window_E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG() 
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(allid);
		
		driver1.switchTo().window(Al.get(1));	
	}
	
	public String GET_Verify_ProfileName() 
	{
		String ActualName = Profilename.getText();
		
		return ActualName;
		
	} 
	
   
}
