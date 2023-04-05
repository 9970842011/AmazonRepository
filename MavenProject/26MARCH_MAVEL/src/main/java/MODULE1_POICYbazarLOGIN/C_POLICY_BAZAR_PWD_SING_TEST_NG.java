package MODULE1_POICYbazarLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_POLICY_BAZAR_PWD_SING_TEST_NG 
{
	//POM-3 PASSWORD WITH SIGIN
	
	@FindBy(xpath="//input[@type='password']") private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement sign;
	
	public C_POLICY_BAZAR_PWD_SING_TEST_NG(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SET_C_POLICY_BAZAR_PWD_SING_TEST_NG_Pwd(String PASSWORD)
	{
		Pwd.sendKeys(PASSWORD);
	}
	
	public void CLICK_C_POLICY_BAZAR_PWD_SING_TEST_NG_sign() 
	{
		sign.click();
	}
	
	

}
