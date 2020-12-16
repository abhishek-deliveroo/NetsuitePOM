import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSample 
{
    @Test
	public  void method() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sravan.k@tvarana.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tvarana@2020");
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	    WebElement authans=driver.findElement(By.xpath("//input[@type='password']"));
	    authans.sendKeys("child");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	Actions a = new Actions(driver);
		
	    //Role Selection 
		/*
		 * a.moveToElement(driver.findElement(By.xpath("//div[@class='ns-role']"))).
		 * build().perform(); List<WebElement> role = driver.findElements(By.xpath(
		 * "//ul[@class='ns-menu']/li[contains(@id,'ns-header-menu-userrole-item')]/a/span"
		 * )); for (WebElement e:role) { System.out.println(e.getText()); String
		 * Role1=e.getText().toString().trim();
		 * if(Role1.contentEquals("ABC  -  Administrator")) {
		 * System.out.println("Test"); e.click(); } } driver.findElement(By.
		 * xpath("//span[text()='Micron Optics  -  Administrator']")).click();
		 */
		
		// Multi Select 
	
		/*
		 * Thread.sleep(2000); a.moveToElement(driver.findElement(By.xpath(
		 * "//ul[@id='ns-header-menu-main']/li[@id='ns-header-menu-main-item4']/a/span")
		 * )).perform(); Thread.sleep(1000);
		 * a.moveToElement(driver.findElement(By.xpath(
		 * "//li[@data-title='Search']/a/span"))).perform(); Thread.sleep(1000);
		 * a.moveToElement(driver.findElement(By.
		 * xpath("//li[@id='ns-header-menu-main-item34']/a/span[text()='Saved Searches']"
		 * ))).perform(); Thread.sleep(1000);
		 * driver.findElement(By.xpath("//span[text()='New']")).click();
		 * driver.findElement(By.xpath("//a[text()='Account']")).click();
		 * driver.findElement(By.xpath("//a[@id='audiencetxt']")).click();
		 * 
		 * a.keyDown(Keys.CONTROL).perform(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[text()='All Leads and Prospects']")).click()
		 * ;
		 * driver.findElement(By.xpath("//a[text()='West Territory Customers']")).click(
		 * ); driver.findElement(By.xpath("//a[text()='Ski Services Team']")).click();
		 * 
		 * List<WebElement> Groups= driver.findElements(By.xpath(
		 * "//div[@nlmultidropdown='audgroup26']/table/tbody/tr/td/a")); for (WebElement
		 * e1:Groups) { String s2= e1.getText().trim(); if
		 * (s2.equals("All Leads and Prospects")||s2.equals("West Territory Customers")|
		 * |s2.equals("Ski Services Team")) {
		 * 
		 * System.out.println(s2);
		 * 
		 * } } a.keyUp(Keys.CONTROL).perform()
		 */;
		 
		 //PO List Dropdown
		 
		 a.moveToElement(driver.findElement(By.xpath("//div[@class='ns-role']"))).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Micron Optics  -  Administrator']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, 3);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transactions']")));		 
		 WebElement Trans=driver.findElement(By.xpath("//span[text()='Transactions']"));
		 a.moveToElement((Trans)).perform();
		 Thread.sleep(2000);
		 a.moveToElement((driver.findElement(By.xpath("//span[text()='Purchases']")))).perform();
		 Thread.sleep(1000);
		 a.moveToElement(driver.findElement(By.xpath("//span[text()='Enter Purchase Orders']"))).click().perform();
		 Thread.sleep(2000);
		
		 WebDriverWait wait1 = new WebDriverWait(driver,5);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='inpt_customform']")));
	     
	     driver.findElement(By.xpath("//input[@name='inpt_customform']")).sendKeys("Standard Purchase Order");
	     //Thread.sleep(15000);
	     WebDriverWait wait2 = new WebDriverWait(driver, 15);
	     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='parent_actionbuttons_entity_fs']/a[2]")));
	    
		 driver.findElement(By.xpath("//span[@id='parent_actionbuttons_entity_fs']/a[2]")).click();
		 driver.findElement(By.xpath("//a[@id='entity_popup_list']")).click();
		 
		 WebDriverWait wait3 = new WebDriverWait(driver,15);
	     wait3.until(ExpectedConditions.elementToBeClickable(By.linkText("020219")));
		 driver.findElement(By.linkText("020219")).click();
		 Alert popup1 = driver.switchTo().alert(); popup1.accept();
		 
		 Thread.sleep(10000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 driver.findElement(By.xpath("//input[@id='item_item_display']")).sendKeys("01 Purchase Maintenance");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='item_addedit']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='btn_secondarymultibutton_submitter']")).click();
 }
 }
