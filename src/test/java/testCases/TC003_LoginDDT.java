package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

//Valid data - login Success - Test Pass
//Valid Data - login fail - Test Fail

//Invalid Data - login fail - Test Pass
//Invalid Data - login success - Test fail

@Test(dataProvider = "LoginData", dataProviderClass=DataProviders.class, groups = "datadriven")
public class TC003_LoginDDT extends BaseClass {
	
	public void verifyLoginDDT(String email, String password, String exp) {
		logger.info("****** Starting TC002_LoginTest*****");
	
try {
		//Home Page
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
	
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setemail(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		//MyAccount
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExist();
	
		if(exp.equalsIgnoreCase("Valid"))
		{
			if (targetPage == true)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if (targetPage == true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else 
			{
				Assert.assertTrue(true);
			}		
		}
	}
	catch(Exception e){
		Assert.fail();
	}
		logger.info("****** Finished TC002_LoginTest*****");
	
		
	
	}
}