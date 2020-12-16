package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClass.LoginClass;

public class StepDefinition 
{
	WebDriver driver;
	@Given("^User currently in Login Page$")
	public void user_currently_in_Login_Page() 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.netsuite.com/portal/home.shtml");
	 }

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() 
	{
	   
	}

	@Then("^User enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String arg1)
	{
	
	}

	@Then("^User enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String arg1) {
	    
	}

	@Then("^User clicks on Submit Button$")
	public void user_clicks_on_Submit_Button() {
	   
	}

	@When("^User enters the \"([^\"]*)\"$")
	public void user_enters_the(String arg1) {
	
	}

	@When("^User clicks on the Submit$")
	public void user_clicks_on_the_Submit() {
	   
	}

	@Then("^User is currently in Home Page$")
	public void user_is_currently_in_Home_Page() {
	   
	}

	@When("^User makes Purchase Order selection from Menu$")
	public void user_makes_Purchase_Order_selection_from_Menu() {

	}

	@When("^User enters all details and click Submit$")
	public void user_enters_all_details_and_click_Submit() {
	   
	}

	@Then("^Purchase Order gets created$")
	public void purchase_Order_gets_created() {
	 
	}



}
