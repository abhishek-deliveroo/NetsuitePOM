package salesorder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SalesOrder 

{
	@Test
	public void m1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.netsuite.com/portal/home.shtml");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sindhuja.b@tvarana.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tvarana@123");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.cssSelector("tr td input[type='password'][name='answer']")).sendKeys("job");
	driver.findElement(By.cssSelector("tr td input[type='submit'][name='submitter']")).submit();
	Thread.sleep(3000);
    WebElement Trans = driver.findElement(By.xpath("//span[text()='Transactions']"));
    Actions a = new Actions(driver);
    a.moveToElement(Trans).perform();
    Thread.sleep(2000);
	WebElement Sales= driver.findElement(By.xpath("//span[text()='Sales']"));
	a.moveToElement(Sales).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Enter Sales Orders']")).click();
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
      	     driver.findElement(By.xpath("//td[@id='spn_secondarymultibutton_submitter']/input")).click();
          

    }
}
