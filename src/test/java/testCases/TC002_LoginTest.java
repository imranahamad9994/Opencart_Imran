package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {


	@Test(groups = {"sanity", "master"})
	
	public void verify_login()
	{
	
		logger.info("****** Starting TC002_LoginTest*****");
	
	try
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		
		//lp.setemail(p.getProperty("email"));
		lp.setemail("imran.ahamad9994@gmail.com");
		//lp.setPassword(p.getProperty("password"));
		lp.setPassword("Kool123");
		
		lp.clickLogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		
		boolean targetPage = macc.isMyAccountPageExist();
		
		Assert.assertTrue(targetPage);
		}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	
		logger.info("****** Finished TC002_LoginTest*****");
	
	
	
	
	
	
	
	}
	
	
	
	
}
