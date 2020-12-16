package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginClass 
{
	@FindBy(xpath="//input[@id='userName']")
	public WebElement Edt_UserName;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement Edt_Password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	public WebElement Btn_Submit;

	public void login(String uid, String pwd) throws InterruptedException 
	{
		Thread.sleep(3000);
		Edt_UserName.sendKeys(uid);
		Edt_Password.sendKeys(pwd);
		Btn_Submit.click();
		Reporter.log("Able to Login");
	}

}
