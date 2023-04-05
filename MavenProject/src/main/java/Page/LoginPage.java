package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//variable Declaration
	
	@FindBy  (xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy  (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy  (xpath="//button[@name='login']")
	private WebElement login;
	
	@FindBy  (xpath="//a[text()='Forgotten password?']")
	private WebElement forgottenpassword;
	
	@FindBy  (xpath="//a[text()='Create new account']")
	private WebElement createnewaccount;
	
	//variable Initialization
	
	public	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Variable use
	
	public void getTextOfUserName()
	{
     String usernametext=username.getText();
	}
	
	public void sendUserName()
	{
		username.sendKeys("powarpriya2020@gmail.com");
	}
	public void getTextOfPassword()
	{
     String passwordtext=password.getText();
	}
	public void sendPassword()
	{
		username.sendKeys("12345");
	}
	
	public void clickOnLoginButton()
	{
		login.click();
	}
	public void clickOnForgottenButton()
	{
		forgottenpassword.click();
	}
	
	public void clickOnCreateNewAcc()
	{
		createnewaccount.click();
	}
	
}
