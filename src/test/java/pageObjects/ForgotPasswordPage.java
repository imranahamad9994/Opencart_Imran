package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testBase.BasePage;

public class ForgotPasswordPage extends BasePage {
	
	
	public ForgotPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	//input[@id='input-email']
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	//input[@value='Continue']
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	//div[@class='alert alert-success alert-dismissible']
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement cnfmessage;
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}

	public String confirmationMessage()
	{
		String cnfmsg;
		try {
		 cnfmsg = cnfmessage.getText();
			}
		catch(Exception e)
	{
		 cnfmsg = e.getMessage();
	}
		return cnfmsg;
	}
}	

