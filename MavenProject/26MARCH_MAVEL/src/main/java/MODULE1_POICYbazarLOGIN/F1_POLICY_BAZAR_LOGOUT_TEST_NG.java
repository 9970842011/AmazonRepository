package MODULE1_POICYbazarLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F1_POLICY_BAZAR_LOGOUT_TEST_NG
{
	@FindBy(xpath="(//img[contains(@src,'data:image')])[4]") private WebElement logout;
	WebDriver driver1;
	
	public F1_POLICY_BAZAR_LOGOUT_TEST_NG(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void Click_F1_POLICY_BAZAR_LOGOUT_TEST_NG() 
	{
		Actions act= new Actions(driver1);
		act.moveToElement(logout).click().build().perform();

	}

}
	