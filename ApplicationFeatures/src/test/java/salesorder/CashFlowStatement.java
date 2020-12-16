package salesorder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CashFlowStatement 
{
 @Test
 public void m1() throws InterruptedException
 {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.netsuite.com/portal/home.shtml");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.dutta@tvarana.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Entally2004$");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.cssSelector("tr td input[type='password'][name='answer']")).sendKeys("grade");
		driver.findElement(By.cssSelector("tr td input[type='submit'][name='submitter']")).submit();
		Thread.sleep(3000);
		
		WebElement Role =driver.findElement(By.xpath("//div[@class='ns-role']/span"));
		Actions a = new Actions(driver);
		a.moveToElement(Role).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Tvarana Dev Production  -  Administrator']")).click();
		Thread.sleep(3000);
	    WebElement Trans = driver.findElement(By.xpath("//span[text()='Transactions']"));
	    a.moveToElement(Trans).perform();
	    Thread.sleep(2000);
	    WebElement arrow = driver.findElement(By.xpath("//li[@class='ns-scroll-button-li']//a"));
	    a.moveToElement(arrow).perform();
	    Thread.sleep(2000);
	    WebElement CashFlow= driver.findElement(By.xpath("//span[text()='Cash Flow Statement']"));
		a.moveToElement(CashFlow).perform();
		Thread.sleep(2000);
		WebElement CashFlow1= driver.findElement(By.xpath("//li[@id='ns-header-menu-main-item34']/a/span"));
	    a.moveToElement(CashFlow1).click().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='custpage_fromdate']")).clear();
	    driver.findElement(By.xpath("//input[@id='custpage_fromdate']")).sendKeys("3/1/2020");
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//input[@id='inpt_custage_currency1']")).sendKeys("USA");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Cash on Hand')]")).click();
	    
}
}
