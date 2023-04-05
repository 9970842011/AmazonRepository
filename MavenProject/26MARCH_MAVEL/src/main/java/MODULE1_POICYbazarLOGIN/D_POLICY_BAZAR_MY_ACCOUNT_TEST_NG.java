package MODULE1_POICYbazarLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG 

       // POM CLASS-4 MY ACCOUNT-->MY PROFILE

   {
      @FindBy(xpath="//div[text()='My Account']")private  WebElement MyACCOUNT;
      @FindBy(xpath="//span[text()=' My profile ']")private  WebElement MyProfile;
      WebDriver driver1;

    public D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG(WebDriver driver) 
      {
	  PageFactory.initElements(driver, this);
	  driver1=driver;
      }

     public void MoveOver_D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG() 
       {
	   Actions act=new Actions(driver1);
	   act.moveToElement(MyACCOUNT).perform();
       }
   
     public void CLICK_D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG_MyProfile() 
     {
	  Actions act=new Actions(driver1);
	  act.moveToElement(MyProfile).click().build().perform();
   
     }

   }

