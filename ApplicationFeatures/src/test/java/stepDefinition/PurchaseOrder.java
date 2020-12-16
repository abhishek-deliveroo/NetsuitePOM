package stepDefinition;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PurchaseOrder 
{
	public WebDriver driver;
	@Given("^User is in Login Page$")
	public void user_is_in_Login_Page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.netsuite.com/portal/home.shtml");
		driver.manage().window().maximize();
	}

	@When("^User clicks Login Button$")
	public void user_clicks_Login_Button() throws InterruptedException 
	{
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log In")).click();
	}

	
	@When("^Title of Login Page is displayed$")
	public void title_of_Login_Page_is_displayed() 
	{
	  String title=driver.getTitle();
	  Assert.assertEquals("NetSuite - Customer Login",title);
	  System.out.println("Title is"+title);
	}

	@Then("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String un) throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(un);
	}

	@Then("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String pwd)throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}

	@Then("^User clicks Submit Button$")
	public void user_clicks_Submit_Button() 
	{
		driver.findElement(By.id("submitButton")).click();
	}

	
	@Then("^User is on Authentication Page$")
	public void user_is_on_Authentication_Page() 
	{
		String s2=	driver.getTitle();
	    Assert.assertEquals("Additional Authentication Required", s2);
		System.out.println("The Authentication Page title is:" +s2);
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String code)
	{
	 driver.findElement(By.cssSelector("tr td input[type='password'][name='answer']")).sendKeys(code);
	}

	@When("^User clicks on Submit$")
	public void user_clicks_on_Submit() 
	{
	 driver.findElement(By.cssSelector("tr td input[type='submit'][name='submitter']")).submit();
	}

	
	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() 
	{
		String home=driver.getTitle();
		System.out.println("The Home Page title is:" +home);
	}
	
	@When("^User selects Purchase Order from Menu$")
	public void user_selects_Purchase_Order_from_Menu() throws InterruptedException 
	{
		Thread.sleep(3000);
	    WebElement Trans = driver.findElement(By.xpath("//span[text()='Transactions']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(Trans).perform();
	    Thread.sleep(2000);
		WebElement Purchases= driver.findElement(By.xpath("//span[text()='Purchases']"));
		a.moveToElement(Purchases).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Enter Purchase Orders']")).click();
	   }

	@Then("^Purchase Order Screen is displayed$")
	public void purchase_Order_Screen_is_displayed() 
	{
		String PO=driver.getTitle();
        System.out.println("The Purchase Order Page title is:" +PO);
	    
	}
    @When("^User enters details and click Submit$")
	public void user_enters_details_and_click_Submit() throws InterruptedException 
	{
	         driver.findElement(By.xpath("//input[@id='inpt_customform1']")).sendKeys("Standard Purchase Order");
	         Thread.sleep(25000);
	         driver.findElement(By.xpath("//span[@id='parent_actionbuttons_entity_fs']/a[2]")).click();
			 driver.findElement(By.xpath("//a[@id='entity_popup_list']")).click();
			 Thread.sleep(5000);
			 List<WebElement> topdd = driver.findElements(By.xpath("//select[@id='psls']//option"));
			 label:
			 for(int i=0;i<topdd.size();i++)
			 {
				 
				 Select s = new Select(driver.findElement(By.id("psls")));
				 s.selectByIndex(i);
			     Thread.sleep(2000);
				 List<WebElement> innerdd= driver.findElements(By.xpath("//div[@id='inner_popup_div']/table/tbody/tr/td[2]/a"));
				 for (int j=0;j<innerdd.size();j++)
				 {
					 String text = innerdd.get(j).getText().trim();
					 
					 if (text.equals("Misc Vendor"))
					 {
						 innerdd.get(j).click();
						 break label;
					 }
				 }
				 
				 
			 }
			 
			 Thread.sleep(3000);
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			 driver.findElement(By.xpath("//span[@id='parent_actionbuttons_item_item_fs']")).click();
			 driver.findElement(By.xpath("//a[@id='item_popup_list']")).click();
             Thread.sleep(3000);
		/*
		 * List<WebElement> topdd1 =
		 * driver.findElements(By.xpath("//select[@id='og']")); labela: for(int
		 * k=0;k<topdd1.size();k++) {
		 * 
		 * Select s = new Select(driver.findElement(By.id("og"))); s.selectByIndex(k);
		 * Thread.sleep(5000);
		 */
			     List<WebElement> middd = driver.findElements(By.xpath("//select[@id='psls']/option"));
			     labela:
			     for(int m=0;m<middd.size();m++)
			     {
				 Select s1 = new Select(driver.findElement(By.id("psls")));
				 s1.selectByIndex(m);
				 Thread.sleep(3000);
				 List<WebElement> innerdd= driver.findElements(By.xpath("//div[@id='inner_popup_div']/table/tbody/tr/td[2]/a"));
				 for (int j=0;j<innerdd.size();j++)
				 {
					 String text = innerdd.get(j).getText().trim();
					 
					 if (text.equals("Fun-GiftCard"))
					 {
						 innerdd.get(j).click();
						 break labela;
						 
					 }
				 }
			   
			 }
			   
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='item_addedit']")).click();
			 driver.findElement(By.xpath("//input[@id='btn_secondarymultibutton_submitter']")).click();
	}
    
	@Then("^Purchase Order is created$")
	public void purchase_Order_is_created() 
	{
		String s3=	driver.findElement(By.xpath("//div[contains(text(),'PUR0000')]")).getText().toString();
	    System.out.println("The Purchse Order created is:"+s3);
    }

}
