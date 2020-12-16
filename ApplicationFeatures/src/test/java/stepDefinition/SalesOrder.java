package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalesOrder 
{
	public WebDriver driver;
	@Given("^User present in Login Page$")
	public void user_present_in_Login_Page() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\QA Framework\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.netsuite.com/portal/home.shtml");
		driver.manage().window().maximize();
		}

	@When("^Login Button is clicked by User$")
	public void login_Button_is_clicked_by_User() throws InterruptedException 
	{
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log In")).click();
	}

	@Then("^User enters the value for username \"([^\"]*)\"$")
	public void user_enters_the_value_for_username(String un) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(un);
	}

	@Then("^User enters the value for password \"([^\"]*)\"$")
	public void user_enters_the_value_for_password(String pwd) 
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}

	@Then("^Submit Button is clicked by User$")
	public void submit_Button_is_clicked_by_User() 
	{
	 driver.findElement(By.id("submitButton")).click();
	}

	@When("^User enters Authentication Code as \"([^\"]*)\"$")
	public void user_enters_Authentication_Code_as(String Code) 
	{
		driver.findElement(By.cssSelector("tr td input[type='password'][name='answer']")).sendKeys(Code);
	}

	@When("^Submit is clicked by User$")
	public void submit_is_clicked_by_User()
	{
	 driver.findElement(By.cssSelector("tr td input[type='submit'][name='submitter']")).submit();
	}

	@When("^User selects Sales Order from Menu$")
	public void user_selects_Sales_Order_from_Menu() throws InterruptedException 
	{
		Thread.sleep(3000);
	    WebElement Trans = driver.findElement(By.xpath("//span[text()='Transactions']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(Trans).perform();
	    Thread.sleep(2000);
		WebElement Sales= driver.findElement(By.xpath("//span[text()='Sales']"));
		a.moveToElement(Sales).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Enter Sales Orders']")).click();
	}

	@Then("^Sales Order Screen is displayed$")
	public void sales_Order_Screen_is_displayed() 
	{
	   System.out.println("Sales Order Screen is displayed");
	}

	@When("^User enters SO details and click Submit$")
	public void user_enters_SO_details_and_click_Submit() throws InterruptedException 
	{
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@id='parent_actionbuttons_entity_fs']/a[2]")).click();
		driver.findElement(By.xpath("//a[@id='entity_popup_list']")).click();
		Thread.sleep(3000);
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
				 
				 if (text.equals("1 : trainee s CUSTOMER"))
				 {
					 innerdd.get(j).click();
					 break label;
				 }
			 }
	       }
		      Thread.sleep(5000);
		      driver.findElement(By.xpath("//span[@id='parent_actionbuttons_item_item_fs']")).click();
		      driver.findElement(By.xpath("//a[@id='item_popup_list']")).click();
	          Thread.sleep(3000);
	          
	      	   List<WebElement> middd = driver.findElements(By.xpath("//select[@id='psls']//option"));
	      	 label:
	      	 for(int i=0;i<middd.size();i++)
	      	 {	
	      		 
	      		 Select s = new Select(driver.findElement(By.id("psls")));
	      		 s.selectByIndex(i);
	      	     Thread.sleep(2000);
	      		 List<WebElement> innerdd= driver.findElements(By.xpath("//div[@id='inner_popup_div']/table/tbody/tr/td[2]/a"));
	      		 for (int j=0;j<innerdd.size();j++)
	      		 {
	      			 String text = innerdd.get(j).getText().trim();
	      			 
	      			 if (text.equals("ALP_ITEM"))
	      			 {
	      				 innerdd.get(j).click();
	      				 break label;
	      			 }
	      		 }
	             }
	      	 Thread.sleep(10000);
      	     driver.findElement(By.xpath("//table[@id='item_splits']/tbody/tr[2]/td[8]/div")).click();
      	     driver.findElement(By.xpath("//input[@id='amount_formattedValue']")).sendKeys("120");
      	     Thread.sleep(2000);
      	     driver.findElement(By.xpath("//input[@id='inpt_custbody_order_type22']")).sendKeys("Contract - New");
      	     Thread.sleep(2000);
      	     driver.findElement(By.xpath("//span[@id='parent_actionbuttons_custbody_end_user_fs']")).click();
		     driver.findElement(By.xpath("custbody_end_user_popup_list")).click();
	          Thread.sleep(3000);
	          
	      	   List<WebElement> enduser = driver.findElements(By.xpath("//select[@id='psls']//option"));
	      	 label:
	      	 for(int i=0;i<enduser.size();i++)
	      	 {	
	      		 
	      		 Select s = new Select(driver.findElement(By.id("psls")));
	      		 s.selectByIndex(i);
	      	     Thread.sleep(2000);
	      		 List<WebElement> innerdd= driver.findElements(By.xpath("//div[@id='inner_popup_div']/table/tbody/tr/td[2]/a"));
	      		 for (int j=0;j<innerdd.size();j++)
	      		 {
	      			 String text = innerdd.get(j).getText().trim();
	      			 
	      			 if (text.equals("2341654714 Focal Point Opticians"))
	      			 {
	      				 innerdd.get(j).click();
	      				 break label;
	      			 }
	      		 }
	             }
      	     Thread.sleep(4000);
      	     driver.findElement(By.xpath("//td[@id='spn_secondarymultibutton_submitter']/input")).click();
	}

	@Then("^Sales Order is created$")
	public void sales_Order_is_created() 
	{
       System.out.println("Sales Order created");
       

	}
}
