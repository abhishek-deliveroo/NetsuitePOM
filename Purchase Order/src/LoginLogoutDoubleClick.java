import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;


public class LoginLogoutDoubleClick 
 {
	public static void main(String args[]) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sravan.k@tvarana.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tvarana@2020");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What school did you attend for sixth grade?" , s2="What is the middle name of your oldest child?",s3="In what city or town was your first job?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("job");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='ns-role']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Micron Optics  -  Administrator']")).click();
		WebElement src= driver.findElement(By.xpath("//h2[contains(text(),'New Release')]"));
		WebElement dest= driver.findElement(By.xpath("//h2[contains(text(),'Key Performance Indicators')]"));
        System.out.println(dest.getLocation());
		a.moveToElement(src).clickAndHold().pause(2000).moveToElement(dest).release().perform();
		Reporter.log("Test Passed");
		
		 
		/* Double click on Uname
		 * a.moveToElement(driver.findElement(By.xpath("//input[@id='userName']"))).
		 * doubleClick().perform();
		 * 
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Keys.chord(
		 * Keys.CONTROL,"c"));
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.chord(
		 * Keys.CONTROL,"a"));
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.chord(
		 * Keys.CONTROL,"v"));
		 */
		 
}

}
