package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	//h2[normalize-space()='My Account']
	//a[@class='list-group-item'][normalize-space()='Logout']
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgMyAccount ;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnkLogout;
	
	
	public boolean isMyAccountPageExist() {
		try
		{
			return (msgMyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
}
