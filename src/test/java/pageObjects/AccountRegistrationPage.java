package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
		
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirm;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement rdosubscribe;

	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement cnfmessage;
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}

	public void settelephone(String telephone)
	{
		txttelephone.sendKeys(telephone);
	}
	
	public void setconfirm(String confirm)
	{
		txtconfirm.sendKeys(confirm);
	}
	
	public void subscribeclick()
	{
		rdosubscribe.click();
	}

	public void agreeclick()
	{
		chkagree.click();
	}

	public void Continueclick()
	{
		btnContinue.click();
	}
	
	public String getConfirmMessage()
	{
		String cnfmsg = null;
		try {
		cnfmsg = cnfmessage.getText();
	}
		catch(Exception e){
			cnfmsg = e.getMessage();
			System.out.println(cnfmsg);
		}
		
		return cnfmsg;
	}
}




