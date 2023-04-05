package MODULE1_POICYbazarLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


     //POM CLASS-1   LOGIN

      public class A_POLICY_BAZAR_LOGIN_TEST_NG 
  
   {
	   @FindBy(xpath="/html/body/div[4]/div[2]/div/ul/li[7]/a")private  WebElement login;
	   WebDriver driver1;

      public A_POLICY_BAZAR_LOGIN_TEST_NG(WebDriver driver) 
      {
    	  PageFactory.initElements(driver, this);
    	  driver1=driver;
      }
      
      public void Click_A_POLICY_BAZAR_LOGIN_TESTNG() 
      {
		Actions act=new Actions(driver1);
		act.moveToElement(login).click().build().perform();
  	  
	  }

    }

