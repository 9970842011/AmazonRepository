package MODULE1_TEST_POLICYbazarLOGIN;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LIBRARY_FILES.H__BASE_CLASS_INITIAL;
import LIBRARY_FILES.I_UTILITY_CLASS;
import MODULE1_POICYbazarLOGIN.A_POLICY_BAZAR_LOGIN_TEST_NG;
import MODULE1_POICYbazarLOGIN.B_POLICY_BAZAR_MOBsING_TEST_NG;
import MODULE1_POICYbazarLOGIN.C_POLICY_BAZAR_PWD_SING_TEST_NG;
import MODULE1_POICYbazarLOGIN.D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG;
import MODULE1_POICYbazarLOGIN.E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG;
import MODULE1_POICYbazarLOGIN.F1_POLICY_BAZAR_LOGOUT_TEST_NG;

public class G_TEST_POLICY_BAZAR_PROFILENAME_Test_NG extends H__BASE_CLASS_INITIAL 
{    Sheet Sh;
     
     A_POLICY_BAZAR_LOGIN_TEST_NG login;
     B_POLICY_BAZAR_MOBsING_TEST_NG mobilesign;
     C_POLICY_BAZAR_PWD_SING_TEST_NG PWDSIGN;
     D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG Myaccount;
     E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG Verify_PN;
     F1_POLICY_BAZAR_LOGOUT_TEST_NG logout;
     int TESTcaseID;
	
     @BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
	    initializeBrowser();

       login = new A_POLICY_BAZAR_LOGIN_TEST_NG(driver);
       mobilesign = new B_POLICY_BAZAR_MOBsING_TEST_NG(driver);
       PWDSIGN =new C_POLICY_BAZAR_PWD_SING_TEST_NG(driver);
       Myaccount =new D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG(driver);
       Verify_PN= new E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG(driver);
       logout= new F1_POLICY_BAZAR_LOGOUT_TEST_NG(driver);

	}
	
	@BeforeMethod
	public void LoginToBrowserApp() throws Exception 
	{
		login.Click_A_POLICY_BAZAR_LOGIN_TESTNG();
		Thread.sleep(2000);
		
		mobilesign.SET_B_POLICY_BAZAR_MOBsING_TEST_NG_MobNO(I_UTILITY_CLASS.GetPropertyFileData("MOBNUM"));
		mobilesign.CLICK_B_POLICY_BAZAR_MOBsING_TEST_NG_MobNO();
		Thread.sleep(2000);
		
		PWDSIGN.SET_C_POLICY_BAZAR_PWD_SING_TEST_NG_Pwd(I_UTILITY_CLASS.GetPropertyFileData("PASSWORD"));
		PWDSIGN.CLICK_C_POLICY_BAZAR_PWD_SING_TEST_NG_sign();
		Thread.sleep(2000);
		
		Myaccount.MoveOver_D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG();
		Myaccount.CLICK_D_POLICY_BAZAR_MY_ACCOUNT_TEST_NG_MyProfile();
		Thread.sleep(2000);
	}
	
	@Test
	public void Verify_PofileName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TESTcaseID=101;
		
		Verify_PN.Switch_Window_E_POLICY_BAZAR_PROFILE_PAGE_TEST_NG();
		Thread.sleep(2000);
		
		String EXpected_ProfileName = I_UTILITY_CLASS.getTestDta(2, 1);
		String Actual_ProfileName=Verify_PN.GET_Verify_ProfileName();
		
		Assert.assertEquals(Actual_ProfileName, EXpected_ProfileName);
	}
	
	 @AfterMethod
	public void LogoutBrowserApp(ITestResult Result) throws InterruptedException, IOException 
	{
		 if(Result.getStatus()==ITestResult.FAILURE) 
		 {
			I_UTILITY_CLASS.CaputreScreenSHOT(driver, TESTcaseID);
		 }
		 
		 
		logout.Click_F1_POLICY_BAZAR_LOGOUT_TEST_NG();
		Thread.sleep(2000);
	}
	
	 @AfterClass  
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
