package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.BaseClass;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {
	

	
	
	@Test(groups = {"regression", "master"})
	public void verify_account_registration()
	{
		logger.info("****** Starting TC001_AccountRegistrationTest********");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my account");
		hp.clickRegister();
		logger.info("Clicked on register");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("Provideing Customer details");
		try 
		{
		regpage.setfirstname(randomString());
		regpage.setlastname(randomString());
		regpage.setemail(randomString()+"@gmail.com");
		
		String password = randomAlphaNumeric();
		
		regpage.setpassword(password);
		regpage.setconfirm(password);
		regpage.settelephone(randomNumber());
		regpage.subscribeclick();
		regpage.agreeclick();
		regpage.Continueclick();
		
		logger.info("Validating Expected message");
		
		String cnfmsg=	regpage.getConfirmMessage();
		Assert.assertEquals(cnfmsg, "Your Account Has Been Created!");
		}
		
		catch(Exception e){
			logger.error("Test Failed");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("****** Finished TC001_AccountRegistrationTest********");
	}	

	

}

