package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	//variable declaration
	@FindBy (xpath="//table//div")
	private WebElement textmessage;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement emailaddressormobilenumber;
	
	@FindBy (xpath="//a[text()='Cancel']")
	private WebElement cancelbutton;
	
	@FindBy (xpath="//button[text()='Search']")
	private WebElement searchbutton;
	
	
	//variable initialization
	public ForgotPasswordPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	//variable use
	
	public String getText()
	{
	String text=textmessage.getText();
	return text;
	}
	
	public void sendEmailOrMobileNumber()
	{
		emailaddressormobilenumber.sendKeys("abc@gmail.com");
	}
	
	
	public void clickOnCancelButton()
	{
		cancelbutton.click();
	}
	public void clickOnSearchButton()
	{
		searchbutton.click();
	}
	

}
