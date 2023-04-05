package MODULE1_POICYbazarLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_POLICY_BAZAR_MOBsING_TEST_NG 
{
	//POM CLASS-2   MOB NO SIGN IN WITH PASSWORD
	
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement MobNO;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signPw;
	
	
	public B_POLICY_BAZAR_MOBsING_TEST_NG(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SET_B_POLICY_BAZAR_MOBsING_TEST_NG_MobNO(String Mobilenumber) 
	{
		MobNO.sendKeys(Mobilenumber);
	} 	
	
	public void CLICK_B_POLICY_BAZAR_MOBsING_TEST_NG_MobNO()
	{
		signPw.click();
	}
	

}
