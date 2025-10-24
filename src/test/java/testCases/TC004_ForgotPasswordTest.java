package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;

public class TC004_ForgotPasswordTest extends BaseClass {

	@Test
	
	void verify_ForgetPassword()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		hp.clickForgottenPassword();
		
		
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.setEmail(p.getProperty("email"));
		fp.clickContinue();
		
		String cnfmsg = fp.confirmationMessage();
		if(cnfmsg.equals("An email with a confirmation link has been sent your email address."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
}
